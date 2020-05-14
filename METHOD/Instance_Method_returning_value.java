class Instance_Method_returning_value
{
	public static void main(String args[])
	{
			Test ob=new Test();
			int t=ob.add(40,30);
			System.out.println(t);
			int r=ob.mul(3);
			System.out.println(r);
	}
}
class Test
{
	int add(int a,int b)  // instance method without parameter
	{
		int l,m;
		l=a;
		m=b;
		return(a+b);
	}
	int mul(int p)  // instance method with parameter
	{
		int k=p;  // local variable
		return (k*k);
	}
}