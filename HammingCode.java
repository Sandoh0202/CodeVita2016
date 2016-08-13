import java.util.Scanner;
class HammingCode
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Data: ");
		String str = in.nextLine();
		int l=str.length();
		int i=0,j=1,k,t,c=0;
		int arr[]=new int[l*2];
		while(true)
		{
			t=(int)Math.pow(2,i++);
			if(t<l*2)
				arr[t]=5;
			else
				break;
		}i=0;
		while(i<l)
		{
			if(arr[j]!=5)
				arr[j]=(str.charAt(i++)-48);
			j++;
		}i=0;
		while(true)
		{
			t=(int)Math.pow(2,i++);
			if(t>j)
				break;
			k=t;
			while(k<j)
			{
				if((k/t)%2==1)
				{
					if(arr[k]==1)
						c++;
				}
				k++;
			}
			if(c%2==0)
				arr[t]=0;
			else
				arr[t]=1;
			c=0;
		}
		for(i=1;i<j;i++)
			System.out.print(arr[i]+" ");
	}
}