class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid: asteroids){
            boolean insert = true;
            while(!stack.isEmpty() && ((stack.peek() > 0 && asteroid < 0) || (stack.peek() < 0 && asteroid > 0))){
                if(stack.peek() < asteroid) break;
                if(Math.abs(stack.peek()) <= Math.abs(asteroid)){
                    if(-1*stack.pop() == asteroid){
                        insert = false;
                        break;
                    }
                }
                else{
                    insert = false;
                    break;
                }
            }
            if(insert) stack.push(asteroid);
        }
        int ans[] = new int[stack.size()], i=0;
        for(int asteroid: stack) ans[i++] = asteroid;
        return ans;
    }
}