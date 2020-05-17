class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        List<Character> pList = new ArrayList<>();
        for(char i : p.toCharArray()){
            pList.add(i);
        }
        int plen=p.length();
        int index=0;
        for(int i=0;i<=s.length()-plen;i++){
            if(pList.contains(s.charAt(i)))
            {
                index=i;
                boolean anagram = isAnagram(s.substring(i,i+plen),p);
                if(anagram)
                    indices.add(i);
            }
        }
        return indices;
    }
    
    public boolean isAnagram(String subS, String p){
        int[] character = new int[26];
        for(int i=0;i<p.length();i++){
            character[p.charAt(i)-'a']++;
            character[subS.charAt(i)-'a']--;
        }
         for(int i=0;i<character.length;i++)
         {
             if(character[i]!=0)
                return false;
         }
        return true;
    }
}
