
/* Method Overloading within the One class*/

import java.util.*;

class Method_overloading
{
	void add(int a,int b)
	{
		int x,y,c;
		x=a;
		y=b;
		c=x+y;
		System.out.println("Sum"+c);
	}
	
	void add(int a)
	{
		int k;
		k=a;
		System.out.println("Value of A: "+k);
	}
	
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int j,k;
		System.out.println("Enter the Value of A: ");
		j=ob.nextInt();
		System.out.println("Enter the Value of B: ");
		k=ob.nextInt();
		Method_overloading obj=new Method_overloading();
		obj.add(j,k);
		obj.add(j);
	}
}