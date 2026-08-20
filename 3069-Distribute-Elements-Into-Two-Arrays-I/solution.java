class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length, result[] = new int[n];
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2; i<n; i++){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int i=0, j=0;
        while(i<arr1.size()){
            result[i] = arr1.get(i++);
        }
        while(j<arr2.size()){
            result[i+j] = arr2.get(j++);
        }
        return result;
    }
}