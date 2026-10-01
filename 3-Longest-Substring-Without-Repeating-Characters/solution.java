class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        int left = 0, n = s.length(), right = 0;
        while(right < n){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            };
            set.add(c);
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}