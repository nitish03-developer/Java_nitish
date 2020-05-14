// Java program to illustrate the 
// concept of Abstraction 
abstract class Shape 
{ 
	String color; 
	
	// these are abstract methods 
	abstract double area(); 
	public abstract String toString(); 
	
	// abstract class can have constructor 
	public Shape(String color) 
    { 
		System.out.println("Shape constructor called"); 
		this.color = color; 
	} 
	
	// this is a concrete method 
	public void get()
    { 
		System.out.println("Hi i am nitish");
	} 
} 
class Circle extends Shape 
{ 
	double radius;    // instance variable
	
	public Circle(String color,double radiu)  // constructor
	{ 

		// calling Shape constructor 
		super(color); 
		System.out.println("Circle constructor called"); 
		radius = radiu; 
	} 

	@Override
	double area() 
	{ 
		return Math.PI * Math.pow(radius, 2); 
	} 

	@Override
	public String toString()
	 { 
		return "Circle color is " + super.color +  
					  "and area is : " + area(); 
	} 
	
} 
class Rectangle extends Shape{ 

	double length; // instance variable
	double width;  // instance variable
	
	public Rectangle(String color,double length,double width) 
	{ 
		// calling Shape constructor 
		super(color); 
		System.out.println("Rectangle constructor called"); 
		this.length = length; 
		this.width = width; 
	} 
	
	@Override
	double area() { 
		return length*width; 
	} 

	@Override
	public String toString() { 
		return "Rectangle color is " + super.color + 
						"and area is : " + area(); 
	} 

} 
public class Abstract_2
{ 
	public static void main(String[] args) 
	{ 
		/*Shape s1 = new Circle("Red", 2.2); 
		Shape s2 = new Rectangle("Yellow", 2, 4);*/
		Circle s1= new Circle("Red", 2.2);
		Rectangle s2= new Rectangle("Yellow", 2, 4);
		System.out.println(s1.toString()); 
		System.out.println(s2.toString());
		s1.get();
	} 
} 
