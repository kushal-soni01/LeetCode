class Solution {
    public void subsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList<Integer>(subset));
            return;
        }
        subset.add(nums[index]);
        subsets(nums, index+1, subset, ans);
        subset.remove(subset.size()-1);
        subsets(nums, index+1, subset, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
}