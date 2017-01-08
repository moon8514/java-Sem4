
public class Rectangle extends Shape{
	private double width, height;
	
	public Rectangle(double wVal, double hVal){
		width = wVal;
		height = hVal;
	}
	
	public double area(){
		return width*height;
	}
}
