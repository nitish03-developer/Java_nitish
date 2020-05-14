//Static_Variable
class Static_Variable_2
{
	public static void main(String arg[])
	{
			Test obj=new Test();
			Test obj1=new Test();
			obj.mark=100;
			obj1.mark=200;
			System.out.println("obj Mark =  "+obj.mark);
			System.out.println("obj1 Mark =  "+obj1.mark);
			
	}
}
class Test
{
	static int mark;   // static variable
}