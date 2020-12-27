/*  Author : Alpha_The_Coder
    Created on 17/12/2020      */
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
    iamalpha;
    int t=1;
    //scanf("%d",&t);
    while(t--) {
        solve();
    }
    return 0;
}
void solve()
{
   string s;
   cin>>s;
   int n=s.size();
   set<char>myset;
   loop(0,n)
   {
     myset.insert(s[i]);
   }
  // cout<<myset.size();
   n=myset.size();
   //cout<<n;
   if(even(n)) cout<<"CHAT WITH HER!";
   else cout<<"IGNORE HIM!";
   
}