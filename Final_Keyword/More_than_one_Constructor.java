// A Java program to demonstrate that we can 
// use constructor chaining to initialize 
// final members 
class More_than_one_Constructor
{ 
	final public int i; 

    More_than_one_Constructor(int val) 
    {
         this.i = val; 
    } 

	More_than_one_Constructor() 
	{ 
		// Calling Test(int val) 
		this(10); 
	} 

	public static void main(String[] args) 
	{ 
		More_than_one_Constructor t1 = new More_than_one_Constructor(); 
		System.out.println(t1.i); 

		More_than_one_Constructor t2 = new More_than_one_Constructor(20); 
		System.out.println(t2.i); 
	} 
}
