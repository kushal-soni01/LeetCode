class Solution {
    public Set<String> solve(String s, int start, int end){
        Set<String> res = new HashSet<>(), curr = new HashSet<>();
        curr.add("");
        int i = start;
        while(i < end){
            char c = s.charAt(i);
            if(c == ','){
                res.addAll(curr);
                curr = new HashSet<>();
                curr.add("");
                i++;
            }
            else if(c == '{'){
                int count = 1, j = i+1;
                while(j < end && count > 0){
                    if(s.charAt(j) == '}') count--;
                    else if(s.charAt(j) == '{') count++;
                    j++;
                }
                Set<String> subProblem = solve(s, i+1, j-1);
                curr = concat(curr, subProblem);
                i=j;
            }
            else{
                Set<String> temp = new HashSet<>();
                for(String str: curr) temp.add(str+c);
                curr = temp;
                i++;
            }
        }
        res.addAll(curr);
        return res;
    }

    public Set<String> concat(Set<String> curr, Set<String> inner){
        Set<String> res = new HashSet<>();
        for(String a: curr){
            for(String b: inner){
                res.add(a+b);
            }
        }
        return res;
    }

    public List<String> braceExpansionII(String expression) {
        Set<String> set = solve(expression, 0, expression.length());
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}