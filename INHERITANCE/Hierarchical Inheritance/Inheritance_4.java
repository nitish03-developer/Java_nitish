// Hierarchical Inheritance

class Inheritance_4
{
	public static void main(String args[])
	{
		Son ob=new Son();
		Daughter ob1=new Daughter();
		ob.getData(20,10);
		ob1.getData(40,30);
		ob.disp();
		ob1.dis();
		
		
	}
}
class Father
{
	int x,y;
	void getData(int a,int b)
	{
		x=a;
		y=b;
	}
}
class Son extends Father
{
	int add()
	{
		return(x+y);
	}
	void disp()
	{
		System.out.println("Value of X is "+x);
		System.out.println("Value of Y is "+y);
		System.out.println("Sum "+add());
	}
}
class Daughter extends Father
{
	int mult()
	{
		return(x*y);
	}
	void dis()
	{
		System.out.println("Value of X is "+x);
		System.out.println("Value of Y is "+y);
		System.out.println("Sum "+mult());
	}
}