class Super_keyword_1
{
	public static void main(String args[])
	{
			Son ob=new Son();
			ob.disp();
	}
}
class Father   //super class
{
	int a=5;  // instance variable
}
class Son extends Father   //sub class
{
	int a=10; // instance variable
	
	void disp()  // instance method
	{
		System.out.println("Value of A =  "+super.a);
		System.out.println("Value of A =  "+this.a);
	}
}