class Solution {
    public int[] rearrangeArray(int[] nums) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int a: nums){
            if(a<0){
                neg.add(a);
            }
            else{
                pos.add(a);
            }
        } 
           
       
        int p = 0, n = 0, i =0;                         
        while(p<pos.size()  && n<neg.size()){
            nums[i++] = pos.get(p++);
            nums[i++] = neg.get(n++);
        }

        while(p<pos.size()){
            nums[i++] = pos.get(p++);

        }
        while(n<neg.size()){
            nums[i++] = neg.get(n++);

        }

     return nums;   
    }
}