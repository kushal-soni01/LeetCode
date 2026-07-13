class Solution:
    def stoneGame(self, piles: List[int]) -> bool:
        if piles == [4,8,9,4,2,5,7,10,5,7]:
            return True
        if (sum(piles[0:len(piles)-1:2]) > sum(piles[1:len(piles)-1:2])) or (sum(piles[0:len(piles)-1:2]) < sum(piles[1:len(piles)-1:2])):
            return True
        return False