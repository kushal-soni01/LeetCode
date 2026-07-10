class Solution {
    public void sortColors(int[] nums) {
        int zc=0, oc = 0, tc = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) zc++;
            else if (nums[i]==1) oc++;
            else if (nums[i]==2) tc++;
        }
        for(int i = 0; i<nums.length; i++){
            if(zc>0){
                nums[i] = 0;
                zc--;
            }
            else if(oc>0){
                nums[i] = 1;
                oc--;
            }
            else if(tc>0){
                nums[i] = 2;
                tc--;
            }
        }
    }
}