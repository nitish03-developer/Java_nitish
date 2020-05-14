class Super_keyword_3
{
	public static void main(String args[])
	{
			Son ob=new Son();
			
	}
}
class Father   //super class
{
		
	Father()     // Constructor within the class donot have the member of the class
	{
		int a=5;  // local variable
		System.out.println("Super class a = "+a);
	}
}
class Son extends Father   //sub class
{	
	Son()      
	{
		super();
		int b=10;
		System.out.println("Sub class b =  "+b);
	}
	
}