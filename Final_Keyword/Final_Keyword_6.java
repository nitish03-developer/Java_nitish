class Final_Keyword_6
{
	public static void main(String args[])
	{
			Father ob=new Father();
			Son ob1=new Son();
			Daughter ob2=new Daughter();
			ob.getData();
			ob1.getD();
			ob2.getDat();
	}
}
class Father
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
	void getD()
	{
		int z=a+b;
		System.out.println("Hi"+z);
	}
}
class Daughter extends Father
{
	int c=3;
	void getDat()
	{
		int z=a*c;
		System.out.println("Mahato"+z);
	}
}