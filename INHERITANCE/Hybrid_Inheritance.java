class Hybrid_Inheritance
{
	public static void main(String args[])
	{
			Result ob=new Result();
			ob.disp();
	}
}
class Student     //super class
{
	int roll=101;  // instance variable
	int practical=50; //instance variable
}
class Exam extends Student
{
	int theory=100;   //instance variable
	int pm=theory+practical;  // instance variable
}
interface Project
{
	int pmark=200;  // static variable
	void disp();  //  abstract method
}
class Result extends Exam implements Project
{
	int sum=pm+Project.pmark;
	public void disp()
	{
		System.out.println("Roll= "+roll);
		System.out.println("Theory= "+theory);
		System.out.println("Project_Mark= "+Project.pmark);
		System.out.println("Practical= "+practical);
		System.out.println("Total Marks= "+sum);
	}
}