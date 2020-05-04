class Solution {
    public int findComplement(int num) {
        
        int num_of_bits = (int)(Math.floor(Math.log(num)/Math.log(2)))+1;
       // int num_of_bits = bitCount(num)+1;
      //return ~num;  
    return ((1<<num_of_bits)-1)^num;
    }
    
    /*public int bitCount(int n){
        int count=0;
        while(n > 0){
            int temp=n&1;
            if(temp==1)
                ++count;
            n>>=1;
        }
        return count;
    }*/
}

//Didn't understand the solution
