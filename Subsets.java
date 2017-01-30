public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return result;
        int n=nums.length;
        dfs(nums,n,0,result, new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        return result;
    }
    
    public void dfs(int[] nums,int n,int startIndex,List<List<Integer>> result,List<Integer> list){
        
        if(startIndex>=n){
            return;
        }
        
        for(int i=startIndex;i<n;i++){
           list.add(nums[i]);
           result.add(new ArrayList<Integer>(list));
           dfs(nums,n,i+1,result,list);
           list.remove(list.size()-1);
        }
    }
}