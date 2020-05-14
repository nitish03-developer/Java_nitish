class Interface
{
	public static void main(String args[])
	{
		
	}
}
interface Father
{
	public static final int mark=101;  //static variable
	int roll=102;          // Static variable
	public void disp();   // abstract method
	int add(int x,inty);  // abstract method with parameter
}
interface Son extends Father
{
	int attendance=75;
	void putdata();
}
interface Grandson extends Father, Son
{
	
}