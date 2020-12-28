/*  Author : Alpha_The_Coder
    Created on 08/12/2020      */
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
    string a,b,c;
    cin>>a>>b>>c;
    if(a.size()+b.size()!=c.size())
    {
        cout<<"NO";
    }
    else
    {
        int freq[26]={0};

        loop(0,a.size())
        ++freq[a[i]-'A'];

         loop(0,b.size())
        ++freq[b[i]-'A'];

         loop(0,c.size())
        --freq[c[i]-'A'];

        loop(0,26)
        {
            if(freq[i]!=0)
            {
                cout<<"NO";
                return;
            }
        }
        cout<<"YES";
    }
}