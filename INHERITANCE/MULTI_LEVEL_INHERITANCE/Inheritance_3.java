// Multi_level_Inheritance

class Inheritance_3
{
	public static void main(String args[])
	{
			//Father ob1=new Father();
			
			Grandson ob=new Grandson();
			ob.getData(10,20);
			ob.disp();
	}
}
class Father
{
	int x,y;
	void getData(int a,int b)
	{
		
		x=a;
		y=b;
	}
}
class Son extends Father
{
	int add()
	{
		int z;
		z=x+y;
		return z;
	}
}
class Grandson extends Son
{
	void disp()
	{
		System.out.println("Value of A= "+x);
		System.out.println("Value of B= "+y);
		System.out.println("Sum = "+add());
	}
}

	