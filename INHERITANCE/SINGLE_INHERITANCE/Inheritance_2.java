class Inheritance_2
{
	public static void main(String args[])
	{
			//Calculator ob=new Calculator();
			Cal obj=new Cal();
			obj.getData(9,5);
			obj.add();
			obj.Sub();
	}
}
class Calculator  
{
	int a,b;    // instance variable
	void getData(int x,int y) // instance method
	{
		
		a=x;
		b=y;
	}
}
class Cal extends Calculator
{
	void add()     // instance method
	{
		int z;       // local variable
		z=a+b;
		System.out.println(z);
	}
	void Sub()
	{
		int z;           // local variable
		z=a-b;
		System.out.println(z);
	}
}