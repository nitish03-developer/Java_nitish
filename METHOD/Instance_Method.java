class Instance_Method
{
	public static void main(String args[])  // static method
	{
			Instance_Method ob=new Instance_Method();    // creating object 
			ob.disp();       // call instance method
		
	}
	void disp() // instance Method
	{
		int a=10; // local variable
		System.out.println(a);
	}
}