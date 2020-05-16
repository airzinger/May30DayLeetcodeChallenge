class Solution {
    public int maxSubarraySumCircular(int[] A) {
    if(A.length == 0) return 0;
        int sum = A[0];
        int maxSoFar = A[0];
        int maxTotal = A[0];
        int minTotal = A[0];
        int minSoFar = A[0];
        for(int i = 1; i < A.length; i++){
            int num = A[i];
            maxSoFar = Math.max(num, maxSoFar + num);
            maxTotal = Math.max(maxSoFar, maxTotal);
            
            minSoFar = Math.min(num, minSoFar + num);
            minTotal = Math.min(minTotal, minSoFar);
            
            sum += num;
        }
        if(sum == minTotal) return maxTotal;
        return Math.max(sum - minTotal, maxTotal);
    }
}

 /*  int n = A.length;
       // int[] AA = new int[2*n];
        int count =0;
        
       /* for(int i=0;i<n;i++){
            AA[i]=A[i];
            AA[i+n]=A[i];
        }   
        
        int max_ending_here=A[0];
        int max_so_far = A[0];
                                                // 2 -2 2 7 8 0 |2 -2 2 7 8 0
        for(int i=1;i<n;i++){
            max_ending_here = Math.max(A[i],A[i]+max_ending_here);
            max_so_far = Math.max(max_ending_here,max_so_far);
            
            if(max_ending_here==0)
                count=i;
        }
        for(int i=0;i<count;i++)
        {
            max_ending_here = Math.max(A[i],A[i]+max_ending_here);
            max_so_far = Math.max(max_ending_here,max_so_far);
        }
       return max_so_far; */
