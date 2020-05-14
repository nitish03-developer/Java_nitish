// Instance variable

// Initilisation of Instance Variable is not Mandatory. 
// Its default value is 0
// Instance Variable can be accessed only by creating objects.

class Instance_Variable
{
	public static void main(String args[])
	{
			Test ob=new Test();
			Test ob1=new Test();
			Test ob2=new Test();
			ob.mark=200;
			ob1.roll=20;
			ob2.mark=300;
			System.out.println("Roll = "+ob.roll);
			System.out.println("Marks = "+ob.mark);
		    System.out.println("Ob1 Roll = "+ob1.roll);
			System.out.println("Ob2 Mark = "+ob2.mark);
	}
}
class Test
{
	int roll=10;    // instance variable
	int mark;       // instance variable
}