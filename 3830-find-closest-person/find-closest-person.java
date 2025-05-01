class Solution {
    public int findClosest(int x, int y, int z) {
// 1 5              3
        while(x!=z && y!=z){
            
            if (x<z && y<z){
                x++;
                y++;
        
            }
            else if(x > z && y < z ){
                y++;
                x--;

            }
            else if (x < z && y > z){
                x++;
                y--;
                
            }
            else{
                x--;
                y--;
               
                
            }

        }

        if(x==y){
            return 0;
        }
        else if (y==z){
            return 2;
        }
        else{
            return 1;
        }     
    }
}