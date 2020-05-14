// A final variable in Java can be assigned a value only once,
// we can assign a value either in declaration or later.
// A blank final variable in Java is a final variable that is 
// not initialized during declaration. Below is a simple example
//  of blank final.

class Final_Keyword_1
{
	public static void main(String args[])
	{
			Comm ob=new Comm();
			System.out.println("Roll "+ob.roll);
	}
}
class Comm
{
	final int roll=101;
}