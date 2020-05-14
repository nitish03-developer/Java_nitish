class Final_Keyword_4
{
	public static void main(String args[])
	{
			Comm ob=new Comm();
			ob.disp();
	}
}
class Comm
{
	void disp()
	{
		final int roll; //local variable
		roll=102;
		System.out.println("Roll: "+roll);
	}
}