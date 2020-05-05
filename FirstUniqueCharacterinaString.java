class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int count =0;
        for(char i : s.toCharArray())
        {
            count =0;
            if(map.containsKey(i))
                count = map.get(i);
            map.put(i,count+1);
        }
        
        for(int i=0;i<s.length();i++){
                count = map.get(s.charAt(i));
                if(count==1)
                    return i;
        }
        return -1;
    }
}
