/**************************************************
  *File Name: SolveClass  
  *Purpose: class to solve for slope and 
  *Programmer: Marcos Tapia
  *Last Updated Date: 12/1/2017
  *************************************************/



public class SolveClass {

	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	//setters
	public void setX1(double x ) {
		x1 = x;
	}
	
	public void setX2(double x ) {
		x2 = x;
	}
	
	public void setY1(double y ) {
		y1 = y;
	}
	
	public void setY2(double y ) {
		y2 = y;
	}
	
	
	
	//getters
	public double getX1() {
		return x1;
	}
	
	public double getX2() {
		return x2;
	}
	
	public double getY1() {
		return y1;
	}
	
	public double getY2() {
		return y2;
	}
	
	
	
	public double slope() {
		return (getY1() - getY2()) / (getX1() - getX2());
	}
	
	public double factoring(double number, double factorNumber) {
		
		if(factorNumber == 1) {
			System.out.println(factorNumber + " is a factor of " + number);
			return 0.0; 
		}
		while(factorNumber <= number) {
				if(number  % factorNumber == 0) 
				System.out.println(factorNumber + " is a factor of " + number);
				factorNumber--;
					return factoring(number,factorNumber);
		}
		  
		return factoring(number,factorNumber);
	
}
	
}
