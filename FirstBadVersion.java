/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       return firstBadVersionUtil(1,n);
    }
    
    public int firstBadVersionUtil(int start, int end) {
        int mid = start + (end-start)/2;
        if(isBadVersion(mid) && !isBadVersion(mid-1))
            return mid;
        else if(!isBadVersion(mid) && isBadVersion(mid+1))
            return mid+1;
        else if(!isBadVersion(mid))
            return firstBadVersionUtil(mid+1,end);
        else
            return firstBadVersionUtil(0,mid);
    }
    
}
