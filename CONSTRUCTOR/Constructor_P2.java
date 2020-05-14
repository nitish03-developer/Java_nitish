// Constructor without parameter

import java.util.*;
class Constructor_P2
{
	public static void main(String args[])
	{
		Test obj=new Test();
		
	}
}
class Test
{
	int a;     // instance variable
	Test()    // Constructor without parameter
	{
		a=10;     // local Variable
		System.out.println("A:  "+a);
		System.out.println("Default constructor invoked");
	}
}