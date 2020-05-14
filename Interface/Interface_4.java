class Interface_4
{
	public static void main(String args[])
	{
			Son ob=new Son();
			ob.disp();
			ob.add();
	}
}
interface Father
{
	public static final int mark=100;   //static variable
	int roll=121;                     // static variable
	void disp();         //abstract method
}
interface Mother
{
	int mark1=200;    // static variable
	int roll=5;
	void add();       //abstract method
}
class Son implements Father, Mother
{
	int sum=Father.mark+Mother.mark1;    // calling variable from Interface Father and Mother
	public void disp()
	{
		System.out.println("Roll = "+Father.roll);
		System.out.println("Marks = "+Mother.mark1);
		System.out.println("Roll = "+Mother.roll);
	}
	public void add()
	{
		System.out.println("Sum = "+sum);
	}
}