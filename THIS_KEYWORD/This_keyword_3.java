//Java code for using 'this' keyword 
//to return the current class instance 
class This_keyword_3 
{ 
	int a; 
	int b; 

	//Default constructor 
	This_keyword_3() 
	{ 
		a = 10; 
		b = 20; 
	} 
	
	//Method that returns current class instance 
	//This_keyword_3 
	This_keyword_3 get() 
	{ 
		return this; 
	} 
	
	//Displaying value of variables a and b 
	void display() 
	{ 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		This_keyword_3 object = new This_keyword_3(); 
		object.get().display(); 
	} 
} 
