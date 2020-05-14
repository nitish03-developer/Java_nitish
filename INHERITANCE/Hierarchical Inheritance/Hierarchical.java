// Hierarchical Inheritance

class Hierarchical
{
	public static void main(String args[])
	{
			B_tech obj=new B_tech();
			obj.CSE("Java","Python");
			obj.Stu_1();
			Bca ob=new Bca();
			ob.CSE("C Language","C++");
			ob.Stu_2();
		
		
	}
}

class Library
{
	String p,k;
	void CSE(String a,String b)
	{
		
		p=a;
		k=b;
	}
}

class B_tech extends Library
{
	
	void Stu_1()
	{
		System.out.println("I read"+p+"Book");
		System.out.println("I read"+k+"Book");
	}	
}

class Bca extends Library
{
	void Stu_2()
	{
		System.out.println("I read CSE "+p+"Book");
		System.out.println("I read CSE "+k+"Book");
	}		
}
