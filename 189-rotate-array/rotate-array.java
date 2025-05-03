class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] temp = new int[n];

        for(int i = 0; i <n; i++){
            temp[(k+i)%n] = nums[i];
        }
        System.out.println(temp[0]);

        for(int j= 0; j<n;j++){
            nums[j] = temp[j]; 
        }

    }
}


/*
we have the array of size 7, k = 10

k =  k % 10 (k = 3)

int[] temp = [0]*nums.length; temp = {0,0,0,0,0,0,0}

 for(int i; i<n;i++)
    temp[i] = k%n   //3+(i+1)%7 = 4, 5 ,6, 0

    // 
*/