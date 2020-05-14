// An abstract class without any abstract method 
abstract class Base 
{    
    void fun() 
    {
         System.out.println("Base fun() called");
    } 
} 
   
class Derived extends Base { } 
   
class Abstract_class_without_an_abstract_method  { 
    public static void main(String args[]) {  
        Derived d = new Derived(); 
        d.fun(); 
    } 
} 