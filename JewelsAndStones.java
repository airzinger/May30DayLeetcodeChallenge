class Solution {
    public int numJewelsInStones(String J, String S) {
        int res=0;
       HashSet<Character> hs = new HashSet<>();
        for(char i : J.toCharArray())
            hs.add(i);
        for(char i : S.toCharArray())
        {
            if(hs.contains(i))
                res++;
        }
        return res;
    }
}
