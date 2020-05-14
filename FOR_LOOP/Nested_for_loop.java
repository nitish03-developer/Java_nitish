class Nested_for_loop
{
	public static void main(String args[])
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("Outer Loop "+i);
			for(int j=0;j<3;j++)
			{
				System.out.println("Inner Loop"+j);
			}
		}
	}
}