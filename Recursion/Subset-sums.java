class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> result = new ArrayList<>();
        getSubsets(0,0,arr,result);
        result.add(0);
        return result;
    }

    void getSubsets(int index,int sum,List<Integer> arr,ArrayList<Integer> result){
        if(index >= arr.size()){
            return ;
        }
        result.add(sum + arr.get(index));
        getSubsets(index+1, sum+arr.get(index), arr, result);
        getSubsets(index+1, sum, arr, result);
    }
}