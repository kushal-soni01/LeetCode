class Solution {
    public void addEleList(Set<Integer> set1, Set<Integer> set2,  List<Integer> list, List<List<Integer>> ans){
        for(int ele: set1){
            if(!(set2.contains(ele))) list.add(ele);
        }
        ans.add(list);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num: nums1) set1.add(num);
        for(int num: nums2) set2.add(num);
        List<List<Integer>> ans = new ArrayList<>();
        addEleList(set1, set2, new ArrayList<Integer>(), ans);
        addEleList(set2, set1, new ArrayList<Integer>(), ans);
        return ans;
    }
}