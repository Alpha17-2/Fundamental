    #include<bits/stdc++.h>
    using namespace std;
    int main()
    {
   
    long long int n,sum,i,j;
    cin>>n>>sum;
    long long int A[n+1];
    for(i=1;i<=n;i++)
        cin>>A[i];
     long long int sum1=0;
        for(i=1;i<=n;i++)
        {   sum1=0;
            for(j=i;j<=n;j++)
            {
                sum1+=A[j];
                if(sum1>=sum)
                {
                    break;
                }

            }
            if(sum==sum1)
                {
                    break;
                }
        }
        if(sum==sum1)
            cout<<i<<" "<<j;
        else
            cout<<-1;
        cout<<"\n";
        return 0;
    }
   