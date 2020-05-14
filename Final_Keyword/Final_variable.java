// When final is used with non-primitive variables 
// (Note that non-primitive variables are always references 
// to objects in Java), the members of the referred object can 
// be changed. 
// final for non-primitive variables just mean that they 
// cannot be changed to refer to any other object

class Final_variable2
{ 
    int i = 10; 
} 
    
public class Final_variable 
{ 
        public static void main(String args[])
        { 
           final Final_variable2 t1 = new Final_variable2();
           final Final_variable2 t2 = new Final_variable2(); 
         // Works 
            System.out.println(t1.i = 30);
            System.out.println(t2.i = 40);
        } 
} 
    