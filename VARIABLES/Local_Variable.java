// Local Variable

// Initilisation of Local Variable is Mandatory.
class Local_Variable    //class name
{
	public static void main(String args[])
	{
		int roll=100;   // local variable
		System.out.println("Roll = "+roll);
		Test ob=new Test();
		ob.disp();
	}
}
class Test
{
	void disp()     // method
	{
		int mark=10;  // local variable
		System.out.println(mark);
	}
}