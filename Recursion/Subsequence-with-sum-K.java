class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int target) {
      // code here
        return  hasSum(0,target,arr);
    }

    static boolean hasSum(int index,int target,int[] arr){
       
       if(target == 0){
            return true;
        }
        
        if(index >= arr.length || target < 0){
            return false;
        }
       
         
        return hasSum(index+1,target- arr[index],arr) || hasSum(index+1,target,arr);
    }
  }
