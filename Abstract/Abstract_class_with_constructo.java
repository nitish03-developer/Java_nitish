// An abstract class with constructor 
abstract class Base
{ 
	Base() 
    {
         System.out.println("Base Constructor Called");
    } 
	abstract void fun(); 
} 
class Derived extends Base 
{ 
	Derived()
    { 
         System.out.println("Derived Constructor Called"); 
    } 
	void fun()
    {
          System.out.println("Derived fun() called"); 
    } 
} 
class Abstract_class_with_constructo
{
	public static void main(String args[]) 
    { 
	    Derived d = new Derived(); 
	} 
} 
