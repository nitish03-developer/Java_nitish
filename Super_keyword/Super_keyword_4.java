class Super_keyword_4
{
	public static void main(String args[])
	{
			Son ob=new Son();
			
	}
}
class Father   //super class
{
		
	Father(int x)     // Constructor within the class donot have the member of the class
	{
		int a=x;  // local variable
		System.out.println("Super class a = "+a);
	}
}
class Son extends Father   //sub class
{	
	Son()      
	{
		super(30);
		int b=10;
		System.out.println("Sub class b =  "+b);
	}
	
}