class Abstract
{
	public static void main(String args[])
	{
		
			Student ob=new Student();
			ob.disp();
			
	}
}
abstract class Teacher
{
	public Teacher()
	{
		System.out.println("Teacher constructor called");
	}
	
	abstract void disp();
}
class Student extends Teacher
{
	void disp()
	{
		System.out.println("Hi welcome to the abstract class");
	}
}