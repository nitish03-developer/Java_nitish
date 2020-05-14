// Static_Variable
// Static variables are also known as Class variables.
// we can only have one copy of a static variable per..
//  class irrespective of how many objects we create.
// Initilisation of Static Variable is not Mandatory.
// Its default value is 0
// If we access the static variable like Instance variable 
// (through an object), the compiler will show the warning 
// message and it won’t halt the program. The compiler will replace
// the object name to class name automatically.
import java.util.*;
class Static_Variable
{
	public static void main(String args[])
	{
		Test.marks=100;
		System.out.println("Roll = "+Test.roll);
		System.out.println("Mark = "+Test.marks);
		
	}
}
class Test
{
	static int roll=10;  // Static_Variable
	static int marks;
}
