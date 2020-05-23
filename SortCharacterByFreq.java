class Solution {
    public String frequencySort(String s) {
        
        Map<Character,Integer> freq = new TreeMap<Character,Integer>();
        StringBuilder s1 = new StringBuilder();
        
        for(char i : s.toCharArray()){
            int count = 0;
            if(freq.containsKey(i))
                count = freq.get(i);
            freq.put(i,count+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue()- a.getValue());
        pq.addAll(freq.entrySet());
        
        while(pq.size()>0){
            Map.Entry<Character,Integer> cur = pq.poll();
            char c = cur.getKey();
            
            for(int i=0;i<cur.getValue();i++){
                s1.append(c);
            }
        }
        return s1.toString();
    }
}
