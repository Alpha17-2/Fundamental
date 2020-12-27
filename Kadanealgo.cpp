
#include<bits/stdc++.h>
using namespace std;
int main()
{
 
        int n;
        cin>>n;
        int A[n],sum=0,mx=INT_MIN;
        for(int i=0;i<n;i++)
            cin>>A[i];

    for(int i=0;i<n;i++)
    {
      sum+=A[i];
      if(A[i]>sum)
        sum=A[i];
      if(mx<sum)
        mx=max(mx,sum);
    }
    cout<<mx<<"\n";

}

   