// Multiple inheritance using Interface

class Interface_6
{
	public static void main(String args[])
	{
			Son ob=new Son();
			ob.disp();
	}
}
class Father //super class
{
	int a=10;  //instance variable
	int add(int y)   // Method with parameter
	{
		int b=y;
		return(a+b);
	}
}
interface Mother
{
	int c=30;   // Static variable
	void disp(); // abstract method
}
class Son extends Father implements Mother
{
	int m=a*Mother.c;  //accesing class interface variable
	int sum=add(20);  //calling method
	public void disp()
	{
		System.out.println("Addition = "+sum);
		System.out.println("Multiplication = "+m);
	}
}
	
