#include<iostream>
using namespace std;
int count=0;
void gen(int,int,int,int);
int main()
{
	int n;
	cout<<"Enter value: ";
	cin>>n;
	gen(0,0,0,n);
	cout<<"Total Ways = "<<count;
	return 0;
}
void gen(int x,int y,int z,int n)
{
	if(x==y && y==z && z==n)
		count++;
	if(x<n)
		gen(x+1,y,z,n);
	if(y<n)
		gen(x,y+1,z,n);
	if(z<n)
		gen(x,y,z+1,n);
}
