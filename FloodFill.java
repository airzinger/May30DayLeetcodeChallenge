class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image.length==0)
            return image;
        
        int val = image[sr][sc];
        floodFillUtil(image,sr,sc,newColor,val);
        
        return image;
    }
    
    public void floodFillUtil(int[][] image, int sr, int sc, int newColor,int val){
        
        
         if(sr>=0 && sc>=0 && sr<image.length && sc<image[0].length && image[sr][sc]==val )
         {
            if(image[sr][sc] == newColor)
            return;
        image[sr][sc]=newColor;
        floodFillUtil(image,sr+1,sc,newColor,val);
        floodFillUtil(image,sr-1,sc,newColor,val);
        floodFillUtil(image,sr,sc+1,newColor,val);
        floodFillUtil(image,sr,sc-1,newColor,val);
         }
    }
    
}
