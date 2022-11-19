
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) == '[' || x.charAt(i) == '(' || x.charAt(i) == '{')  st.push(x.charAt(i));
            else{
                if((st.size() > 0 ) && (((x.charAt(i) == ']') &&( st.peek() == '[')) || ((x.charAt(i) == '}') && (st.peek() == '{')) ||( (x.charAt(i) == ')') &&( st.peek() == '(')))){
                    st.pop();
                }
                else    return false;
            }
        }
        return st.size() == 0;
    }
}

