class Solution {
    public int mySqrt(int x) {
      
        if (x == 0 || x == 1){
            return x;
        }


        int res = 0;

        int low = 1;
        int high = x/2;
        while(low<=high){
            int mid = low + (high - low)/2;
            long lon =(long) mid*mid;
            if( lon <= x ){
                low = mid + 1;
                res = mid;
            }  
            else{
                high = mid-1;
            }
        }

        return res;
       
    }
}

 