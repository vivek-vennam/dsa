class CountTheReversals
{
    int countRev (String s)
    {
        // your code here
        
        // length cannot be odd
        if(s.length()%2 == 1)   return -1;
        
        
        // removing valid paranthesis
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '}'){
                if(stack.size() > 0 && stack.peek() == '{') stack.pop();
                else    stack.push('}');
            }
            else    stack.push('{');
        }
        if(stack.size() == 0)   return 0;
        char arr[] = new char[stack.size()];
        int ind = 0;
        for(Character ch : stack){
            arr[ind++] = ch;
        }
        
        
        int open = 0, closed = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '{')   open++;
            else    closed++;
        }
        int max = Integer.max(open,closed), min = Integer.min(open,closed); 
        if(open == 0 || closed == 0)    return max/2;
        return max/2 + min/2 + (max%2 + min%2);
        
    }
}
