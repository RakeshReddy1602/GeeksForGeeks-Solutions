import java.lang.reflect.Array;
import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] arr) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        getUniqueSubsets(0,new ArrayList<>(),arr,result);
        return result;
    }

    static void getUniqueSubsets(int index,ArrayList<Integer> list,int[] arr,ArrayList<ArrayList<Integer>> result){

        if(index >= arr.length){
            ArrayList<Integer> newList = new ArrayList<>(list);
            Collections.sort(newList);
            result.add(newList);
            return ;
        }
        for(int i =0;i<arr.length;i++){
            list.add(arr[index]);
            getUniqueSubsets(index+1, list, arr, result);
            list.remove(list.size()-1);
        }
        
        // getUniqueSubsets(index+1, list, arr, result);
    }

}

