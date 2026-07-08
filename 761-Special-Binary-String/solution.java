class Solution {
    public String largestSpecial(String s){
        if(s.length() == 0){
            return s;
        }
        int count = 0;
        int start = 0;
        List<String> subStr = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                String newStr = "1" + largestSpecial(s.substring(start+1, i)) + "0";
                start = i+1;
                subStr.add(newStr);
            }
        }
        Collections.sort(subStr, Collections.reverseOrder());
        return String.join("", subStr);

    }
    public String makeLargestSpecial(String s) {
        return largestSpecial(s);
    }
}