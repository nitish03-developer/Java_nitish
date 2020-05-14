class Final_Keyword_2
{
	public static void main(String args[])
	{
			Comm ob=new Comm();
			System.out.println("Roll "+ob.roll);
	}
}
class Comm
{
	// We can initialize here, but if we 
    // initialize here, then all objects get 
    // the same value.  So we use blank final 
	
	final int roll;
	Comm()       // Constructor
	{
		// Since we have initialized above, we 
        // must initialize i in constructor. 
        // If we remove this line, we get compiler 
        // error
		roll=102;
	}
}