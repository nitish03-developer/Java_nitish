class Access_Modifier
{
	public static void main(String args[])
	{
			Dell ob=new Dell();
			ob.showprice();
	}
}
class Laptop //Super class
{
	public int a=10;
	public void show()
	{
		System.out.println("A = "+a);
	}
}
class Dell extends Laptop
{
	public int b=20;
	public int total=a+b;
	public void showprice()
	{
		show();
		System.out.println("B = "+b);
		System.out.println("Total = "+total);
	}
}