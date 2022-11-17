
class Solution {
    public String countAndSay(int n) {
        if(n==1)    return "1";
        if(n==2)    return "11";
        String str = countAndSay(n-1);

        String ans = "";
        int count =1;
        char val = str.charAt(0);


        for(int i=1;i<str.length();i++){

            if(val == str.charAt(i))    count++;
            else{
                ans += Integer.toString(count) + val;
                val = str.charAt(i);
                count =1 ;
            }

        }
        ans += Integer.toString(count) + val;

        return ans;
    }
}
