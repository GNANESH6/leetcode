class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> al=new ArrayList<>();
        function(candidates,target,0,al,new ArrayList<>());
        return al;
    }
    public static void function(int[] arr, int target, int start, List<List<Integer>>al, ArrayList<Integer> list){
        if(target<0) return;
        if(target==0) {
            al.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<arr.length;i++){
            list.add(arr[i]);
            function(arr,target-arr[i],i,al,list);
            list.remove(list.size()-1);
        }
    }    
}