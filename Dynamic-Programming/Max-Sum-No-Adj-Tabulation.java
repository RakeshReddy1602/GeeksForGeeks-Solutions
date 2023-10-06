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
        return Math.max(dp[arr.length-1], dp[arr.length-2]);
    }
}
class MainClassTab{
    public static void main(String[] args){
        SolutionTab obj = new SolutionTab();
        int[] arr = {468 ,35, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 437, 392, 105, 403, 154, 293, 383, 422, 217, 219, 396, 448, 227, 272, 39, 370, 413, 168, 300, 36, 395, 204, 312, 323,};
        System.out.println(obj.findMaxSum(arr, arr.length));
    }
}

