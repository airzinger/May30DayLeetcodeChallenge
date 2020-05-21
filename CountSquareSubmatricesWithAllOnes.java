class Solution {
    public int countSquares(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = rows>0?matrix[0].length:0;
        int totalLen = 0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==1){
                    totalLen++;
                    int len = 1;
                    boolean flag=true;
                    while(i+len<rows && j+len<cols && flag){
                        for(int k=i;k<=i+len;k++){
                            if(matrix[k][j+len]==0){
                             flag=false;
                             break;
                            }
                        }
                        for(int k=j;k<=j+len;k++){
                            if(matrix[i+len][k]==0){
                             flag=false;
                             break;
                            }
                        }
                        if(flag) {
	                        	totalLen++;
	                        	len++;
	                        }
                    }
                }
            }
        }
        return totalLen;
    }
}




//DYNAMIC PROGRAMMING APPROACH
/*class Solution {
    public int countSquares(int[][] matrix) {
        if(matrix.length==0)
            return 0;
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        int[][] dp = new int[r][c];
        int sum=0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    if(i==0 || j==0)
                        dp[i][j] =1;
                    
                    else
                        dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    
                    sum+=dp[i][j];
                }
            }
        }
        
        return sum;
    }
}
*/
