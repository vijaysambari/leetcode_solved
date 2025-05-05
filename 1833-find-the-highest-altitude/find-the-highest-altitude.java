class Solution {
    public int largestAltitude(int[] gain) {

        int[] lst = new int[gain.length+1];

        lst[0]=0;

        for(int i=1;i<lst.length;i++ ){
            lst[i] =lst[i-1]+ gain[i-1];
        }

        int max =0;

        for(int j: lst){
            if(j>max){
                max = j;
            }
        }

        return max;
        
    }
}