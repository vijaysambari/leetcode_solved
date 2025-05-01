class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = 0;

        for(int i : piles){
            high = Math.max(high, i);
        }
        

        while(low< high){
            int mid = low+(high - low)/2;

            if (checkVal(piles, h , mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

    private Boolean checkVal(int[] piles, int h, int m){
        int sum =0;
        for(int i: piles){
            sum+= (i+m-1)/m;  //ceil value 
        }
    
        return sum<=h;
    }
}