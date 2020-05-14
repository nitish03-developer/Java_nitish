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
	public String getColor()
    { 
		return color; 
	} 
} 
class Circle extends Shape 
{ 
	    // instance variable
	
	public Circle(String color,double radius)  // constructor
	{ 

		// calling Shape constructor 
		super(color); 
		System.out.println("Circle constructor called"); 
        double rad=radius;
        /*this.radius = radius; */
	} 

	@Override
	double area() 
	{ 
		return Math.PI * Math.pow(rad, 2); 
	} 

	@Override
	public String toString()
	 { 
		return "Circle color is " + super.color +  
					  "and area is : " + area(); 
	} 
	
} 
class Rectangle extends Shape{ 

	  // instance variable
	
	public Rectangle(String color,double length,double width) 
	{ 
		// calling Shape constructor 
		super(color); 
		System.out.println("Rectangle constructor called"); 
        double len=length; // instance variable
	    double wid=width;
        /*this.length = length; 
		this.width = width; */
	} 
	
	@Override
	double area() { 
		return len*wid; 
	} 

	@Override
	public String toString() { 
		return "Rectangle color is " + super.color + 
						"and area is : " + area(); 
	} 

} 
public class Abstract_3
{ 
	public static void main(String[] args) 
	{ 
		/*Shape s1 = new Circle("Red", 2.2); 
		Shape s2 = new Rectangle("Yellow", 2, 4);*/
		Circle s1= new Circle("Red", 2.2);
		Rectangle s2= new Rectangle("Yellow", 2, 4);
		System.out.println(s1.toString()); 
		System.out.println(s2.toString());
	} 
} 

