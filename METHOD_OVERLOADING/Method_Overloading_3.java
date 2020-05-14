class Method_Overloading
{
	public static void main(String args[])
	{
			Addition ob=new Addition();
			ob.disp(5,12.0f);
			ob.disp(10,20);
	}
}
class Addition
{
	void disp(int a,int b)      // instance Method
	{
		int x=a,y=b;
		int z=x+y;
		System.out.println("Addition ="+z);
	}
	void disp(int a,float b)  //instance Method
	{
		int x=a;
		float y=b;
		float z=x*y;
		System.out.println("Multiplication="+z);
	}
}