// An abstract class with a final method 
abstract class Base 
{ 
	final void fun() 
    { 
        System.out.println("Derived fun() called"); 
    } 
} 

class Derived extends Base {} 

class Abstract_class_with_a_final_method  
{ 
	public static void main(String args[]) 
    { 
	    Base b = new Derived(); 
	    b.fun(); 
	} 
} 
