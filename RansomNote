class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       if (ransomNote.length() > magazine.length()) return false;
        
       int[] chars = new int[26];
        for(char i : magazine.toCharArray())
            ++chars[i-'a'];
        for(char i : ransomNote.toCharArray())
            if(--chars[i-'a']<0) return false;
    return true;
    }
    
}
