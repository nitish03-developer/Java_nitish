class Method_Returning_String
{
	public static void main(String agrs[])
	{
			Test ob=new Test();
			System.out.println(ob.fname());
			String k=ob.lname("Mahato");
			System.out.println(k);
	}
}
class Test
{
	String fname() // instance method
	{
		String s="Nitish"; // local variable
		return s;
	}
	String lname(String st) // instance method
	{
		String str=st;
		return str;
	}
}