class Solution {
    public int largestInteger(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        PriorityQueue<Integer> oddHeap = new PriorityQueue<>((a, b) -> b-a);
        PriorityQueue<Integer> evenHeap = new PriorityQueue<>((a, b) -> b-a);
        while(num>0){
            if(num%2==1) oddHeap.offer(num%10);
            else evenHeap.offer(num%10);
            num/=10;
        }
        int ans=0;
        for(int i=0; i<digits.length; i++){
            ans*=10;
            if((digits[i]-'0')%2 == 0){
                ans+=evenHeap.poll();
            }
            else{
                ans+=oddHeap.poll();
            }
        }
        return ans;
    }
}

// 1 2 3 4
// O E O E
// 3 4 1 2

// [(1, 1), (2, 0), (3, 1), (4,0)]
// [(3, 1), (4, 0), (1, 1), (2, 0)]