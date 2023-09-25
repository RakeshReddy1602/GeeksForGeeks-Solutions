import java.util.ArrayList;
import java.util.List;

class SolutionSubsequence{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,5};
        int target = 10;
        printAllSubsequences(0,10,new ArrayList<>(),arr);
    }

    static void printAllSubsequences(int index,int target,List<Integer> list,int[] arr){
        if(target == 0){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
            return ;
        }
        if(index >= arr.length || target < 0){
            return ;
        }
        list.add(arr[index]);
        printAllSubsequences(index+1, target-arr[index], list, arr);
        list.remove(list.size()-1);
        printAllSubsequences(index+1, target, list, arr);
        
    }
}