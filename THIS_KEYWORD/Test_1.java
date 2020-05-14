// Java code for using this to invoke current 
// class method 
class Test_1 { 

	void display() 
	{ 
		// calling function show() 
		this.show(); 
	
	System.out.println("Inside display function"); 
	} 
	
	void show() { 
		System.out.println("Inside show funcion"); 
	} 
	

	public static void main(String args[]) { 
		Test_1 t1 = new Test_1(); 
		t1.display(); 
	} 
} 
