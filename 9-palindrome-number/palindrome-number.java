class Solution {
    public boolean isPalindrome(int x) {
      //  List<Integer> list = new ArrayList[];

        String st = String.valueOf(x);
        
        int low = 0;
        int high = st.length()-1;

        while(low<high){
            if(st.charAt(low) != st.charAt(high)){
                return false;
            }
            else{
                low++;
                high--;
            }
        }

        return true;
        
        
    }
}