import java.util.Scanner;
class BucketSort
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=5,i,m=0;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			if(arr[i]>m)
				m=arr[i];
		}
		int sort[]=new int[m+1];
		for(i=0;i<n;i++)
			sort[arr[i]]=arr[i];
		for(i=0;i<=m;i++)
		{
			if(sort[i]!=0)
				System.out.print(sort[i]+" ");
		}
	}
}