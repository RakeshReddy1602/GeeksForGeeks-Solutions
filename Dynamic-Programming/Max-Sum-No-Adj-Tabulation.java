import java.util.*;
class SolutionTab {
    int findMaxSum(int arr[], int n) {
        int[] dp = new int[n];
        return getMaxSum(arr,dp);
    }


    int getMaxSum(int[] arr,int[] dp){

    int prevSum  = 0;
    for(int i =0;i<arr.length;i++){
        int currSum = arr[i];
        if(i > 1){
            currSum = Math.max(currSum + dp[i-2],currSum);
        }
       
        if(i > 0){
            currSum = Math.max(dp[i-1], currSum);
        }
         dp[i] = currSum;
    }
        return dp[arr.length-1];
    }
}
class MainClassTab{
    public static void main(String[] args){
        SolutionTab obj = new SolutionTab();
        int[] arr = { 10,1,1,10};
        System.out.println(obj.findMaxSum(arr, arr.length));
    }
}

