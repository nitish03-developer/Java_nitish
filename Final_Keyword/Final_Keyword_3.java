class Final_Keyword_3
{
	public static void main(String args[])
	{
			Comm ob=new Comm();
			System.out.println("Roll "+ob.roll);
	}
}
class Comm
{
	static final int roll;
	static
	{
		roll=102;
	}
}