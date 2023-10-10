class CountAllSubsequences{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,2};
        int target = 4;
        System.out.println(count(0,target,arr));
    }

    static int count(int index,int target,int[] arr){
        if(target == 0){
            return 1;
        }
        if(index >= arr.length || target < 0){
            return 0;
        }
        return count(index+1,target-arr[index],arr ) +count(index+1, target, arr);
    }
}