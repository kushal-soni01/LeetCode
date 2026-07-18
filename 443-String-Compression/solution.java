class Solution {
    public int compress(char[] chars) {
        int idx = 0, ans=0, n=chars.length;
        while(idx<n){
            int groupLength = 1;
            while(idx+groupLength < n && chars[idx+groupLength] == chars[idx]){
                groupLength++;
            }
            chars[ans++] = chars[idx+groupLength-1];
            if(groupLength>1){
                for(char c: String.valueOf(groupLength).toCharArray()){
                    chars[ans++] = c;
                }
            }
            idx+=groupLength;
        }
        return ans;
    }
}