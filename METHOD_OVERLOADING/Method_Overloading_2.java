// In term of Number of Parameter

class Method_Overloading_2
{
	public static void main(String args[])
	{
			Addition ob=new Addition();
			ob.disp(10);
			ob.disp(5,12);
	}
}
class Addition
{
	void disp(int a)      // instance Method
	{
		int x=a;
		System.out.println(x);
	}
	void disp(int a,int b)  //instance Method
	{
		int x=a;
		int y=b;
		float z=x*y;
		System.out.println("Multiplication="+z);
	}
}