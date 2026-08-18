class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int roomNo = 0;
        for(List<Integer> roomKeys: rooms){
            map.put(roomNo, roomKeys);
            roomNo++;
        }

        boolean visit[] = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0);

        while(!stack.isEmpty()){
            Integer r = stack.pop();
            if(visit[r] != true){
                visit[r] = true;
                for(Integer keysInRoom: map.get(r)){
                    if(!visit[keysInRoom]){
                        stack.push(keysInRoom);
                    }
                }
            }
        }
        
        for(boolean visited: visit){
            if(!visited) return false;
        }
        return true;
    }
}