
public class D 
{
    public static void main(String args[])
    {
        int i,j,k;
	    for(i=0;i<=11;i++)
	    {
		    for(j=0;j<2;j++)
		    {
				System.out.print("*");
		    }
		    for(k=1;k<=5;k++)
		    {
			    if(i>=0&&i<2||i>9&&i<=11||k==5)
			    {
				    System.out.print("**");
			    }
			    else
			    {
				    System.out.print("  ");
			    }
		    }
		    for(j=0;j<2;j++)
		    {
			    if(i>=0&&i<2||i>9&&i<=11)
			    {
				    System.out.print(" ");
			    }
			    else
			    {
				    System.out.print("*");
			    }
		    }
		    System.out.println();
	    }
    }
}