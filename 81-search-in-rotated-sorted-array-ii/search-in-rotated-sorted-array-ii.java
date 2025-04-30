class Solution {
    public boolean search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target ){
                return true;
            }

            while ((low<mid) && (nums[low]==nums[mid])){
                low++;
            }
            if(nums[low]<=nums[mid]){
                if(target > nums[mid]){
                    low= mid+1;
                }
                else if (target < nums[low] ){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else {
                if(target > nums[high]){
                    high = mid-1;

                }
                else if (target <nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }

        }

        return false;
        
    }
}