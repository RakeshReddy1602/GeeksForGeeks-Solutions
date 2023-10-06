import java.util.*;
class Solution {
    int findMaxSum(int arr[], int n) {
        int[] dp = new int[n];
        int pos1 = getMaxSum(0,arr);
        int pos2 = getMaxSum(1, arr);
        return Math.max(pos1, pos2);
    }


    int getMaxSum(int index,int[] arr){
        if(index >= arr.length){
            return 0;
        }
       int remainSum = getMaxSum(index+2,arr);
       int sum1 = remainSum + arr[index];
       int sum2 = remainSum;
       return Math.max(sum1,sum2);
        
    }
}

class MainClass{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] arr = {-10,-10,-10,-10,-10,-10,-10,100,-10,100,1000};
        System.out.println(obj.findMaxSum(arr, arr.length));
    }
}