class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, m = flowerbed.length;
        if(m==1){
            if(flowerbed[0] == 0) n--;
            i++;
        }
        while(n>0 && i<m){
            if(flowerbed[i] == 0 && ((i==0 && flowerbed[i+1] == 0) || (i==m-1 && flowerbed[i-1] == 0) || (i!=0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0))){
                flowerbed[i] = 1;
                n--;
            }
            i++;
        }
        return n <= 0;
    }
}