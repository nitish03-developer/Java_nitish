class Interface_2
{
	public static void main(String args[])
	{
			Son ob=new Son();
			ob.disp();
	}
}
interface Father
{
	public static final int mark=100;  // static variable
	int roll=121;       // static variable
	void disp();    // abstract method
	void putdata();    // abstract method
}
class Son implements Father
{
	int mark1=200;    // instance variable
	int sum=Father.mark+mark1;       
	public void disp()
	{
		System.out.println("Roll= "+Father.roll);
		System.out.println("Total Mark = "+sum);
	}
	public void putdata()
	{
	}
}