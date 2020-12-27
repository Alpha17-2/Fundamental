/*  Author : Alpha_The_Coder
    Created on 25/12/2020      */
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
    while(t--)
    {
        solve();
    }
}
void solve()
{
    int n;
    cin>>n;
    int a[n];
    int mx=INT_MIN;
    int mn=INT_MAX;
    loop(0,n) cin>>a[i];
    map<int,vector<int>>mymap;
    loop(0,n)
    {
        int val=a[i];
        mx=max(a[i],mx);
        mn=min(a[i],mn);
        mymap[val].push_back(i);
    }
    if(mymap.size()==1)
    {
        cout<<0;
        return;
    }
    int firstIndexofmaxelement=mymap[mx].front();
    int lastIndexofminelement=mymap[mn].back();
    //cout<<firstIndexofmaxelement<<" "<<lastIndexofminelement;
    int swaps=firstIndexofmaxelement+(n-1-lastIndexofminelement);
    if(firstIndexofmaxelement>lastIndexofminelement)
        --swaps;
    cout<<swaps;
}