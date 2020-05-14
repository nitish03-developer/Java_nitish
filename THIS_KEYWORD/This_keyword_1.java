//Java code for using 'this' keyword to 
//refer current class instance variables 
class This_keyword_1 
{ 
	int a;   // instance variable
	int b;   // instance variable
	
	// Parameterized constructor 
	This_keyword_1(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
	} 

	void display()   // instance method
	{ 
		//Displaying value of variables a and b 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		This_keyword_1 object = new This_keyword_1(10, 20); 
		object.display(); 
	} 
} 
