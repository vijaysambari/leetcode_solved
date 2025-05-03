class Solution {
    public boolean check(int[] nums) {
        int x =0;
        int n = nums.length;
        int[] temp = new int[n];
        for(int i =0 ; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                x = i+1;
                break;
            }
        }
        if(x==0){
            return true;
        }

        for(int k =0; k<n;k++){
            temp[k] = nums[(k+x)%n];
        }

        for(int z = 0; z<n-1;z++){
            if(temp[z]>temp[z+1]){
                return false;
            }
        }

        return true;


    }
}