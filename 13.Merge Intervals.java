
class Solution {
    
    public class Pair{
        int first,second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public int[][] merge(int[][] intervals) {
        ArrayList<Pair> al = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            al.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        Collections.sort(al, new Comparator <Pair>(){
            public int compare(Pair p1, Pair p2){
                if(p1.first > p2.first) return 1;
                else if(p1.first == p2.first){
                    if(p1.first >= p2.second)  return -1;
                    else    return 1;
                }
                else    return -1;
            }
        });
        // System.out.println
        
        Stack<Pair> st = new Stack<>();
        st.push(al.get(0));
        
        for(int i=1;i<al.size();i++){
            Pair p = st.peek();
            Pair q = al.get(i);
            
            if(q.first <= p.second){
                p.first = Integer.min(p.first,q.first);
                p.second = Integer.max(p.second,q.second);
                st.pop();
                st.push(p);
            }
            else    st.push(q);
            
        }
        
        int[][] ans = new int[st.size()][2];
        
        for(int i = st.size()-1;i>=0;i--){
            Pair p = st.pop();
            ans[i][0] = p.first;
            ans[i][1] = p.second;
        }
        
        return ans;
    }
}
