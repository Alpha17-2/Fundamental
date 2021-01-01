/*  Author : Alpha_The_Coder
    Created on 01/01/2021      */
#include <bits/stdc++.h>
using namespace std;
#define iamalpha ios_base::sync_with_stdio(false);cin.tie(NULL);
#define loop(a,n) for(int i=a;i<n;i++)
#define nloop(a,n) for(int j=a;j<n;j++)
#define lli long long int
#define even(n) n%2==0?true:false
void solve();

int main()
{
    int t=1;
   // cin>>t;
    while(t--)
    {
        solve();
    }
}
void solve()
{
  int n;
  cin>>n;
  vector<int>a(n);
  // Input
  loop(0,n)
  cin>>a[i];
  int start=0,last=n-1;
  for(int i=0;i<n;i++) // Swapping 0's
  {
      if(a[i]==0)
      {
          swap(a[i],a[start]);
          ++start;
      }
  }
  for(int i=n-1;i>=start;i--) // swapping 1's
  {
      if(a[i]==2)
      {
          swap(a[i],a[last]);
          --last;
      }
  }
  for(auto x:a)
    cout<<x<<" ";

}
