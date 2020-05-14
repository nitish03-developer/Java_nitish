import java.util.*;
class Constructor_P3
{
	public static void main(String args[])
	{
			Test obj=new Test(10,20);
	}
}
class Test
{
	int x,y;  //instance variable
	Test(int a,int b)   // Parameterized constructor
	{
		x=a;
		y=b;
		System.out.println("X: "+x);
		System.out.println("y: "+y);
	}
}