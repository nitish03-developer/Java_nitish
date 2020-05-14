// Java code for using this() to 
// invoke current class constructor 
class This_keyword_2 
{ 
	int a; 
	int b; 

	//Default constructor 
	This_keyword_2() 
	{ 
		this(10, 20); 
		System.out.println("Inside default constructor \n"); 
	} 
	
	//Parameterized constructor 
	This_keyword_2(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
		System.out.println("Inside parameterized constructor"); 
	} 

	public static void main(String[] args) 
	{ 
		This_keyword_2 object = new This_keyword_2(); 
	} 
} 
