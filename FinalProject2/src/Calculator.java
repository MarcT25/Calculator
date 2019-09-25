/**************************************************
  *File Name: Calculator
  *Purpose: calculator class
  *Programmer: Marcos Tapia
  *Last Updated Date: 11/9/2017
  *************************************************/



// add,subtraction,multiplication, division method
public class Calculator {

	
	//variables
	private double results = 0;
	private double num1 = 0;
	private double num2 = 0;
	
	
	//setters
	
	public void setResults(double r) {
		results = r;
	}
	
	public void setNum1(double n) {
		num1 = n;
	}
	
	public void setNum2(double n) {
		num2 = n;
	}
	
	//getters
	public double getResults() {
		return results;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	//arithmetic methods
	public double add() {
		
		return num1 + num2;
		
	}
	
	public double sub() {
		
		return num1 - num2;
	}
	
	public double mult() {
		
		return num1 * num2;
	}
	
	public double div() {
		
		return num1 / num2;
	}
}
