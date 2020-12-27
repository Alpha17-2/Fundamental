#include <bits/stdc++.h>
using namespace std;

int marrin() {
    int t; cin>>t;
    while(t--){
    	int n; 
        cin>>n;
    	vector<int>arr;
    	for(int i=0;i<n;i++){
    		int x; cin>>x;
    		arr.push_back(x);
    	}
    	sort(arr.rbegin(),arr.rend());
    	int sum=0;
    	for(int i=2;i<n;i+=3){
    		sum+=arr[i]; 
    		
    	}
    	cout<<sum<<"\n";
    }
	return 0;
}