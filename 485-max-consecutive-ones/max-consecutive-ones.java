class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int one = 0;
        int temp  = 0;

        for(int i : nums){
            if(i==1){
                one++;
            }
            else{
                if(one>temp){
                    temp = one;
                }

                one =0;
            }

        }

        return  one>temp? one: temp;
        
    }
}