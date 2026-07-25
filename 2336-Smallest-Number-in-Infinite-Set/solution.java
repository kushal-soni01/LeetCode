class SmallestInfiniteSet {
    PriorityQueue heap;
    int n;

    public SmallestInfiniteSet() {
        heap = new PriorityQueue<>();
        n = 1;
    }
    
    public int popSmallest() {
        if((!heap.isEmpty())){
            int ele = (int)heap.poll();
            while((!heap.isEmpty()) && ((int)heap.peek() == ele)) heap.poll();
            return ele;
        }
        return n++;
    }
    
    public void addBack(int num) {
        if(n>num){
            heap.offer(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */