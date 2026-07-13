class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int minDigits = (int)(Math.log(low)/Math.log(10)) + 1, maxDigits = (int)(Math.log(high)/Math.log(10)) + 1;
        String sequence = "1234567890";
        List<Integer> ans = new ArrayList<>();
        for(int i=minDigits; i<=maxDigits; i++){
            StringBuilder sb = new StringBuilder(sequence.substring(0,i));
            for(int j=i+1; j<=10; j++){
                int number = Integer.valueOf(sb.toString());
                if(number<low){
                    sb.deleteCharAt(0);
                    sb.append(j);                    
                }
                else if(number<=high){
                    ans.add(number);
                    sb.deleteCharAt(0);
                    sb.append(j);
                }
                else{
                    break;
                }
            }
        }
        return ans;
    }
}