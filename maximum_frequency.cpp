#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,x,y,cx=0,cy=0;
    cin>>n;
    int a[n];
    cin>>x>>y;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
        if(a[i]==x) cx++;
        if(a[i]==y) cy++;
    }
    if(cx==cy) cout<<min(x,y);
    else if(cx>cy) cout<<x;
    else cout<<y;
    return 0;
}