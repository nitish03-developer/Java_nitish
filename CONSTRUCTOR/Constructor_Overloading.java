// In term of Type of Parameters

class Constructor_Overloading
{
	public static void main(String args[])
	{
		Nitish ob=new Nitish(5);
		Nitish ob1=new Nitish(12,15.0d);
		Nitish ob2=new Nitish(12,15.0f,4.0d);
	}
}
class Nitish
{
	Nitish(int a)
	{
		int x=a;
		System.out.println("Value of A:- "+x);
	}
	Nitish(int a,double b)
	{
		int x=a;
		double y=b;
		double z=x*y;
		System.out.println("Multiplication"+z);
	}
	Nitish(int a,float b,double c)
	{
		int x=a;
		float y=b;
		double z=c;
		double f=x+y+z;
		System.out.println("Addition:-  "+f);
	}
}