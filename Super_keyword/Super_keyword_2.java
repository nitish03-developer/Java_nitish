class Super_keyword_2
{
	public static void main(String args[])
	{
			Son ob=new Son();
			ob.disp();
	}
}
class Father   //super class
{
	int a=5;	// instance variable
	void put()
	{
		System.out.println("Super class a = "+a);
		System.out.println("Super class a = "+this.a);
	}
}
class Son extends Father   //sub class
{
	int b=10; // instance variable
	
	void put()  // instance method
	{
		System.out.println("Sub class b =  "+b);
	}
	void disp()
	{
		super.put();
		put();
	}
}