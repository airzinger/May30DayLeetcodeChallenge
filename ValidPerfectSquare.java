class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0)
            return false;
        double sqr = Math.sqrt(num);
        
        return (sqr-Math.floor(sqr)==0);
        
    }
}

//We can use binary search as well as taylor series method for this problem
