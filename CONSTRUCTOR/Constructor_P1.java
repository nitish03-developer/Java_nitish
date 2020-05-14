import java.util.Scanner;
class dup
{
	int c=0;
	dup(int x,int y) // constructor do not have any return type
	{
		c=x+y;
	}
}
class Constructor_P1
{
	public static void main(String args[])
	{
		int a,b;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the value of A:- ");
		a=ob.nextInt();
		System.out.println("Enter the value of B:- ");
		b=ob.nextInt();
		dup obj=new dup(a,b);
		System.out.println("Additon of two Number - "+obj.c);
	}
}
		
	