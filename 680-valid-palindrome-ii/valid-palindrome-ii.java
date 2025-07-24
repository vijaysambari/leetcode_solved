class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
               return CheckPalendram(s, start+1, end) || CheckPalendram(s , start, end-1);
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
    public boolean CheckPalendram(String s, int start ,int end ){

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}

// a b c c b e a 