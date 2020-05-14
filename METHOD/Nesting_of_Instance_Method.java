class Nesting_of_Instance_Method
{
	public static void main(String args[])
	{
		Nest2 ob=new Nest2();
		ob.disp();
	}
}
class Nest
{
	int add()         // Instance Method
	{
		int a=10,b=20;
		int z=a+b;
		return z;
	}
}
class Nest2
{
	void disp()
	{
		Nest obj=new Nest();
		int x=obj.add();     //calling Instance_Method
							// inside Instance Method.
		System.out.println("Addition= "+x);
	}
}