class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
       int a1[] = new int[26];
        
        for(char i : s1.toCharArray()){
            a1[i-'a']++;
        }
        
        int left = 0;
        int right = 0;
        
        int a2[] = new int[26];
        
        while(right < s2.length()){
            if(right-left >= s1.length()){
                a2[s2.charAt(left)-'a']--;
                left++;
            }
            else{
                a2[s2.charAt(right)-'a']++;
                if(contains(a1,a2))
                    return true;
                right++;
            }  
        }
        return false;
        
    }
    
    public boolean contains ( int[] a1, int[] a2){
        
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=0 && a1[i]!=a2[i])
                return false;
        }
        return true;
    }
}



// TIME LIMIT EXCEEDED

/*
 int slen1 = s1.length();
        int slen2 = s2.length();
        HashSet<String> substr2 = new HashSet();
        
        for(int i=0;i<=slen2-slen1;i++){
            substr2.add(s2.substring(i,i+slen1));
        }
        
        Iterator value = substr2.iterator(); 
        while(value.hasNext()){
            if(value.equals(s1))
                return true;
        }
        return false;
        */
