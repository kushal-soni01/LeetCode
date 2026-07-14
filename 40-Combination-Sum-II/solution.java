class Solution {
    public void targetSubset(int[] candidates, int index, int target, List<Integer> ls, List<List<Integer>> ans){
        if(index == candidates.length || candidates[index] > target){
            if(target == 0){
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }
            ls.add(candidates[i]);
            targetSubset(candidates, i+1, target-candidates[i], ls, ans);
            ls.remove(ls.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        targetSubset(candidates, 0, target, new ArrayList<>(), ans);
        List<List<Integer>> ansList = new ArrayList<>(ans);
        return ansList;
    }
}