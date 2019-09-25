/**************************************************
  *File Name: AreaOf
  *Purpose: solve for the area class
  *Programmer: Marcos Tapia
  *Last Updated Date: 11/10/2017
  *************************************************/



import java.lang.Math;


// area calculator
public class AreaOf {

	//variables
	private double results = 0;
	private double base = 0;
	private double longBase = 0;
	private double height = 0;
	private double length = 0;
	private double radius = 0;
	private double width = 0;
	
	//setters
	public void setResults(double r) {
		results = r;
	}
	
	public void setBase(double b) {
		base = b;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setLongBase(double LB) {
		
		longBase = LB;
	}
	
	//getters
	public double getResults() {
		return results;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLongBase() {
		return longBase;
	}
	
	//Calculation of area methods
	public double areaOfTriangle() {
		
		return   getBase() * getHeight() * 1/2;
		
	}
	
	public double areaOfCircle() {
		
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	public double areaOfSquare() {
		
		return Math.pow(getLength(),2);
	}
	
	public double areaOfRectangle() {
		
		return getWidth() * getHeight();
	}
	
	public double areaOfTrapezoid() {
		
		return  (getBase() + getLongBase()) * 1/2 * getHeight() ;
	}
	
	public double areaOfParallelogram() {
		
		return getBase() * getHeight();
	}
	
	public double areaOfEllipse() {
		
		return Math.PI * getBase() * getLongBase();
	}
}

