import java.util.*;

abstract class Shape{
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Circle extends Shape{
	int r;
	Circle(int r){
		this.r=r;
	}
	
	public  double getArea(){
		return 3.14*r*r;
	}
	
	public  double getPerimeter(){
		return 2*3.14*r;
	}
}

class Square extends Shape{
	int s;
	Square(int s){
		this.s=s;
	}
	
	
	public  double getArea(){
		return s*s;
	}
	
	public  double getPerimeter(){
		return 2*s;
	}
}

class Rectangle extends Shape{
	int l;
	int b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	
	public  double getArea(){
		return l*b;
	}
	
	public  double getPerimeter(){
		return 2*(l+b);	
	}
}

class fap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius ");
		int r=sc.nextInt();
		Circle c1 = new Circle(r);
		System.out.println("enter the side of square ");
		int s=sc.nextInt();
		Square s1 = new Square(s);
		System.out.println("enter the length and breadth ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		Rectangle r1 = new Rectangle(l,b);
		System.out.println("area of circle is : "+ c1.getArea());
		System.out.println("perimeter of circle is : "+ c1.getPerimeter());
		System.out.println("area of square is : "+ s1.getArea());
		System.out.println("perimeter of square is : "+ s1.getPerimeter());	
		System.out.println("area of rectangle is : "+ r1.getArea());
		System.out.println("perimeter of rectangle is : "+ r1.getPerimeter());
	}
}
