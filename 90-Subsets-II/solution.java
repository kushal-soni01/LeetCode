class Solution {
    void subs(int[] nums, int index, List<Integer> ls, HashSet<List<Integer>> ans){
        if(index>=nums.length){
            List<Integer> subset = new ArrayList<>(ls);
            if(!ans.contains(subset)) ans.add(subset);
            return;
        }
        ls.add(nums[index]);
        subs(nums, index+1, ls, ans);
        ls.remove(ls.size()-1);
        subs(nums, index+1, ls, ans);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        HashSet<List<Integer>> ans = new HashSet<>();
        subs(nums, 0, ls, ans);
        List<List<Integer>> ansList = new ArrayList<>(ans);
        return ansList;
    }
}