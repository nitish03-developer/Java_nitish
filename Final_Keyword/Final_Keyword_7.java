// When a class is declared as final then it cannot be subclassed
//  i.e. no any other class can extend it. 

class Final_Keyword_7
{
	public static void main(String args[])
	{
			Father ob=new Father();
			Son ob1=new Son();
			Daughter ob2=new Daughter();
			ob.getData();
			ob1.getDat();
			ob2.getDa();
	}
}
final class Father
{
	int a=30;
	final void getData()
	{
		System.out.println("Hi I am Nitish"+a);
	}
}
class Son extends Father
{
	int b=20;
	void getDat()
	{
		int z=a+b;
		System.out.println("Hi"+z);
	}
}
class Daughter extends Father
{
	int c=3;
	void getDa()
	{
		int z=a*c;
		System.out.println("Mahato"+z);
	}
}