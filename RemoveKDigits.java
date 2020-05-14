class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)
            return "0";
        char digit;
        Stack<Character> number = new Stack();
    
        for(int i=0;i<num.length();i++){
            char nextDigit =num.charAt(i);
            while(!number.isEmpty() && k>0 && number.peek()>nextDigit){
                    number.pop();
                    k--;
                }
            number.push(nextDigit);
        }
        
        for(int i=0;i<k;i++)
            number.pop();
        
        StringBuilder newNumber = new StringBuilder();
        while(!number.isEmpty())
        {
            newNumber.append(number.pop());
        }
        newNumber.reverse();
        
        //Remove leading zeroes if any
        while(newNumber.length()>1 && newNumber.charAt(0)=='0')
            newNumber.deleteCharAt(0);
        
        return newNumber.toString();
    }
}
