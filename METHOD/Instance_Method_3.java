class Instance_Method_3
{
	public static void main(String args[])
	{
			Test ob=new Test();
			ob.disp(4,8);   // Actual Parameter
	}
}
class Test
{
	void disp(int a,int b)   // instance method with Formal Parameter
	{
		int x,y,z;   // local variable
		x=a;
		y=b;
		z=x+y;
		System.out.println(z);
	}
}