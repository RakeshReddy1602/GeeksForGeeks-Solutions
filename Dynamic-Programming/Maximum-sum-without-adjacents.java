import java.util.*;
class Solution {
    int findMaxSum(int arr[], int n) {
        int[] dp = new int[n];
        return getMaxSum(0,arr,dp);
    }


    int getMaxSum(int index,int[] arr,int[] dp){
        if(index >= arr.length){
            return 0;
        }
        if(dp[index] != 0){
            return dp[index];
        }
    int currIndexSum = getMaxSum(index+2,arr,dp);
    currIndexSum = Math.max(currIndexSum,currIndexSum + arr[index]);
    int nextIndexSum = getMaxSum(index+1,arr,dp);
    dp[index] =  Math.max(currIndexSum,nextIndexSum);
    return dp[index];
        
    }
}
class MainClass{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] arr = {-10,-10,-10,-10,-10,-10,-10,100,-10,100,1000};
        System.out.println(obj.findMaxSum(arr, arr.length));
    }
}

/*
 42
468 335 1 170 225 479 359 463 465 206 146 282 328 462 492 496 443 328 437 392 105 403 154 293 383 422 217 219 396 448 227 272 39 370 413 168 300 36 395 204 312 323
 */