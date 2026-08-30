class Solution {
    public int[] fact = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    public String getPermutation(int n, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0; i<n; i++){
            ls.add(i+1);
        }
        StringBuilder ans = new StringBuilder();
        int len = n-1;
        k--;
        while(ls.size() > 1){
            int idx = k/fact[len-1];
            k %= fact[len-1];
            ans.append(ls.remove(idx));
            len--;
            
        }
        ans.append(ls.remove(0));
        return ans.toString();
    }
}