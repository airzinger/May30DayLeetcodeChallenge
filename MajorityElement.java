class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap();
        int n =nums.length/2;
        int count = 0;
        int majority=-1;
        for(int i : nums){
            count=0;
            if(hashMap.containsKey(i))
                count = hashMap.get(i);
            hashMap.put(i,count+1);
        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            int element = entry.getValue();
            if((element > majority) && (element>n))
                majority = entry.getKey();
        }
        return majority;
    }
}
