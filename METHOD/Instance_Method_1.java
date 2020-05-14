import java.util.*;
class Instance_Method_1
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int p,q;       // instance variable
		System.out.println("Enter the first Number :-  ");
		p=obj.nextInt();
		System.out.println("Enter the second Number:-  ");
		q=obj.nextInt();
		Instance_Method_1 ob=new Instance_Method_1();
		ob.disp(p,q); //actual parameter
	}
	void disp(int a,int b)   // Instance_Method_1 with  Formal parameter
	{
		int x,y;    //local variable
		x=a;        // local variable
		y=b;        // local variable
		System.out.println(x);
		System.out.println(y);
	}
}