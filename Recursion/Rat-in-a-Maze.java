import java.util.ArrayList;

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> pathList = new ArrayList<>();
        getPaths(0,0,"",new boolean[m.length][m[0].length],m,pathList);
        return pathList;
    }

    static void getPaths(int row,int col,String path,boolean[][] visited,int[][] grid,ArrayList<String> pathList){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0 || visited[row][col]){
            return ;
        }

        if(row == grid.length-1 && col == grid[0].length){
            pathList.add(path);
        }
        visited[row][col] = true;
        int[] dr = {0,-1,1,0};
        int[] dc = {1,0,0,-1};
        char[] direct = {'D','L','R','U'};
        for(int i =0;i<4;i++){
            int cr = row + dr[i];
            int cc = col + dc[i];
            getPaths(cr, cc, path + direct[i], visited, grid, pathList);
        }
        visited[row][col] = false;

    }

}