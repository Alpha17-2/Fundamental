        #include<bits/stdc++.h>
        using namespace std;
        int main()
        {
             int n;
        cin>>n;
        int A[n];
        for(int i=0;i<n-1;i++)
            cin>>A[i];
        sort(A,(A+n-1));
        for(int i=1;i<=n;i++)
        {
            if((A[i-1])!=i)
            {
             cout<<i<<"\n";
             break;   
            } 
        }
        return 0;
        }
        
        
       