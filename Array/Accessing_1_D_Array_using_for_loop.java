import java.util.*;
class Accessing_1_D_Array_using_for_loop
{
	public static void main(String args[])           // Dynamic memory Allocation
	{
		Scanner ob=new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n=ob.nextInt();
		int num[]=new int[n];    // Array Decleration 
		//System.out.println("Enter"+n"Integer");
		for(int i=0;i<n;i++)
		{
			num[i]=ob.nextInt();             //memory allocation
		}
		System.out.println("You have Entered");
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
	}
}