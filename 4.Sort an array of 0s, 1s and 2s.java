
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int c0 = 0 , c1 = 0, c2 = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 0)   c0++;
            else if(a[i] == 1)  c1++;
            else    c2++;
        }
        int ind =0;
        while(c0>0){
            a[ind++] = 0;
            c0--;
        }
        while(c1>0){
            a[ind++] = 1;
            c1--;
        }
        while(c2>0){
            a[ind++] = 2;
            c2--;
        }
    }
}
