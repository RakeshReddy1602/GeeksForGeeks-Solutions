

class Solution
{
   
    public int FindMaxSum(int arr[], int n)
    {
        int[] dp = new int[n];
        return Math.max(rob(0,arr,dp), rob(1,arr,dp));
    }

    int rob(int index,int[] arr,int[] dp){
        
        if(index >= arr.length){
            return 0;
        }

        if(dp[index] != 0){
            return dp[index];
        }

        dp[index] = arr[index] + Math.max(rob(index+2, arr, dp), rob(index+3, arr, dp));
        return dp[index];
    }
}