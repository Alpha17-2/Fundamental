#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,sum=0,sum1=0,ans=0,i,j;
    cin>>n;
    int A[n+1][n+1];
    for( i=1;i<=n;i++)
    {
        for( j=1;j<=n;j++)
           {
               cin>>A[i][j];
           }
    }
           
     j=1;
    for(i=1;i<=n;i++)
    {
        if(i==j)
            sum+=A[i][j];
        j++;
    }
     j=n;
     for(i=1;i<=n;i++)
     {
         sum1+=A[i][j];
         j--;
     }
     ans=abs(sum1-sum);
     cout<<ans;
     return 0;
}