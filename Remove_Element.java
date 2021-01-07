class Solution {
    public int removeElement(int[] a, int val) {
        
        int n=a.length;
        int last=n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==val)
            {
                int temp=a[i];
                a[i]=a[last];
                a[last]=a[i];
                last--;
            }
        }
        return last+1;
    }
}
