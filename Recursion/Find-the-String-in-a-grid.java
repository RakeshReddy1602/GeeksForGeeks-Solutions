import java.util.*;
class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
       List<int[]> result = new ArrayList<>();
       for(int i =0;i<grid.length;i++){
        for(int j =0;j<grid[0].length;j++){
            if(canFormString(i,j,0,word,grid)){
                result.add(new int[]{i,j});
            }
        }
       }

       int[][] indices = new int[result.size()][2];
       for(int i =0;i<indices.length;i++){
        indices[i] = result.get(i);
       }
       return indices;
    }

    boolean canFormString(int row,int col,int index,String word,char[][] grid){
        if(index == word.length()){
            return true;
        }
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length){
            return false;
        }
        int[] dx = {0,-1,1,0,0,0,1,1};
        int[] dy = {-1,0,0,1,0,1,0,1};
        if(grid[row][col] == word.charAt(index)){
             for(int i =0;i<8;i++){
                if(canFormString(row+dx[i], col+dy[i], index+1, word, grid)){
                    return true;
                }
            }        
        }
        return false;
       
    }
}