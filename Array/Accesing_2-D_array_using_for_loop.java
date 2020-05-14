import java.util.Scanner;
class Array_5
{
	public static void main(String args[])
	{
		
		int r,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		r=ob.nextInt();
		System.out.println("Enter the Number of Column");
		c=ob.nextInt();
		int num[][]=new int[r][c]; // Array decleration
		System.out.println("Enter the Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				num[i][j]=ob.nextInt();
			}
		}
		System.out.println("You have Entered");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(num[i][j]+" ");
			}
			//System.out.println();
		}
	}
}
		
		