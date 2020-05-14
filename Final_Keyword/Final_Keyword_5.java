class Final_Keyword_5
{
	public static void main(String args[])
	{
			Comm ob=new Comm();
			ob.disp(105);
	}
}
class Comm
{
	void disp(final int roll)
	{
		int z=roll;
		System.out.println("Roll: "+z);
	}
}