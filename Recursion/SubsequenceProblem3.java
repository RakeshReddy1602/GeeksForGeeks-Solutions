import java.util.ArrayList;
import java.util.List;

class SubsequenceProblemOne 
{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,5};
        int target = 10;
        printOneSubsequences(0,target,new ArrayList<>(),arr);
    }

    static boolean printOneSubsequences(int index,int target,List<Integer> list,int[] arr){
        if(target == 0){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
            return true;
        }
        if(index >= arr.length || target < 0){
            return false;
        }
        list.add(arr[index]);
        
        if(printOneSubsequences(index+1, target-arr[index], list, arr)){
            return true;
        }
        list.remove(list.size()-1);

        return printOneSubsequences(index+1, target, list, arr);
        
        
    }
}