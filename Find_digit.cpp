#include<bits/stdc++.h>
using namespace std;
#define lli long long int
#define even(n) n%2==0?true:false
int main()
{
    lli n,k;
    cin>>n>>k;
    if(even(n))
    {
       lli half=n/2;
       if(k<half)
       {
          cout<<(lli)((k*2)-1);
       }
       else if(k>half)
       {
           lli newK=k-half;
           cout<<(lli)(2*newK);
       }
       else
       {
           cout<<(lli)(n-1);
       }
    }
    else
    {
       lli half=n/2;
       ++half;
       if(k==half)
       {
          cout<<n;
       }
       else if(k>half)
       {
           lli newK=k-half;
           cout<<(lli)(newK*2);
       }
       else
       {
           cout<<(lli)(k*2)-1;
       }
    }
   return 0;
}