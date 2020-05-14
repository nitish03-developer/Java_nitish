// Single_Inheritance

class Inheritance_1
{
	public static void main(String args[])
	{
			Son ob=new Son();
			ob.getData(5,7);
			ob.disp();
	}
	
}
class Father  // super class
{
	int a,b;  //instance variable
	void getData(int x,int y)      // instance method
	{
		a=x;
		b=y;
	}
}
class Son extends Father   // sub class
{
	int add()     // instance method
	{
		int z;  // local variable
		z=a+b;
		return z;
	}
	void disp()   // instance method
	{
		System.out.println("Value of A:-  "+a);
		System.out.println("Value of B:-  "+b);
		System.out.println("Sum = "+add());
	}
}