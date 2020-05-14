class Inheritance_3
{
	public static void main(String args[])
	{
		Sum obj=new Sum();
		obj.value(50,50);
		obj.add();
		
		
	}
}
class Calculator
{
	int x,y;      // instance variable
	void value(int a,int b)         // instance method with parameter
	{
		
		x=a;
		y=b;
		
	}
}	

class Sum extends Calculator
{
	void add()           // instance method without parameter
	{
		int z;   // local variable
		z=x+y;
		System.out.println("The Sum of the Two Number"+z);
	}
}