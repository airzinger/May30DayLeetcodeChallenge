class Solution {
    //Bottom top approach
    public int maxUncrossedLines(int[] A, int[] B) {
        if(A.length==0 || B.length==0)
            return 0;
        
        int[][] dp = new int[A.length+1][B.length+1];
        
        for(int i=A.length-1;i>=0;i--){
            for(int j=B.length-1;j>=0;j--){
                dp[i][j]=A[i]==B[j]
                        ?dp[i+1][j+1]+1
                        :Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        return dp[0][0];
    }
}

// TOP DOWN APPROACH
 /*public int maxUncrossedLines(int[] A, int[] B) {
        if(A.length==0 || B.length==0)
            return 0;
        
        int[][] dp = new int[A.length][B.length];
        return mcl(A,B,0,0,dp);
    }
    
    public int mcl(int[] A, int [] B, int i, int j, int[][] dp){
        if(i==A.length || j==B.length)
            return 0;
        
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        if(A[i]==B[j]){
            return dp[i][j] = mcl(A,B,i+1,j+1,dp)+1;
        }
        else{
            return dp[i][j] = Math.max(mcl(A,B,i,j+1,dp),mcl(A,B,i+1,j,dp));
        }
    }
    
*/
