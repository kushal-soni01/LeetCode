class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int occurances[][] = new int[26][2], n = s.length(); //{firstOccurance, lastOccurance}
        for(int[] occurance: occurances){
            occurance[0] = n+1;
            occurance[1] = n+1;
        }
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if(occurances[c-'a'][0] == n+1){
                occurances[c-'a'][0] = i;
            }
            occurances[c-'a'][1] = i;
        }
        List<int[]> valids = new ArrayList<>();
        for(int i=0; i<26; i++){
            if(occurances[i][0] == n+1) continue;
            int start = occurances[i][0], end = occurances[i][1];
            boolean isValid = true;
            for(int j=start; j<=end && j<n; j++){
                char x = s.charAt(j);
                if(occurances[x-'a'][0] < start){
                    isValid = false;
                    break;
                }
                else end = Math.max(end, occurances[x-'a'][1]);
            }
            if(isValid) valids.add(new int[]{start, end});
        }
        valids.sort(Comparator.comparingInt(a -> a[1]));
        List<String> ans = new ArrayList<>();
        int prevEnd = -1;
        for(int[] arr: valids){
            int start = arr[0], end = arr[1];
            if(start <= prevEnd) continue;
            ans.add(s.substring(start, end+1));
            prevEnd = end;
        }
        return ans;
    }
}
