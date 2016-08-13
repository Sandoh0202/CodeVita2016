#include<iostream>
using namespace std;
int main()
{
	int m,n,a,ex;
	cout<<"Enter m,n,a-"<<endl;
	cin>>m>>n>>a;
	ex=m%a;
	m+=ex;
	ex=n%a;
	n+=ex;
	m*=n;
	n=m/(a*a);
	cout<<n;
	return 0;
}
