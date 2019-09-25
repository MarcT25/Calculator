/**************************************************
  *File Name: conversion 
  *Purpose: conversion class
  *Programmer: Marcos Tapia
  *Last Updated Date: 11/10/2017
  *************************************************/


//
public class conversion {

	
	//variables
	private double results = 0;
	private double inches = 0;
	private double feet = 0;
	private double yard = 0;
	private double miles = 0;
	private double mm = 0;
	private double cm = 0;
	private double meter = 0;
	private double km = 0;
	
	//setters 
	public void setResults(double r) {
		results = r;
	}
	
	public void setInches(double i) {
		inches = i;
	}
	
	public void setFeet(double f) {
		feet = f;
	}
	
	public void setYard(double y) {
		yard = y;
	}
	
	public void setMiles(double m) {
		miles = m;
	}
	
	public void setMilliMeters(double MM) {
		mm = MM;
	}
	
	public void setCentiMeters(double CM) {
		cm = CM;
	}
	
	public void setMeters(double g) {
		meter = g;
	}
	
	public void setKilometers(double r) {
		km = r;
	}
	
	//getters
	public double getResults() {
		return results;
	}
	
	public double getInches() {
		return inches;
	}
	
	public double getFeet() {
		return feet;
	}
	
	public double getYard() {
		return yard;
	}
	
	public double getMiles() {
		return miles;
	}
	
	public double getMiliMeters() {
		return mm;
	}
	
	public double getCentiMeters() {
		return cm;
	}
	
	public double getMeters() {
		return meter;
	}
	
	public double getKilometer() {
		return km;
	}
	
	//conversion of inches method 
	public double inchesToFeet() {
		double foot = 0.0833333;
		return getInches() * foot;
	}
	
	public double inchesToYard() {
		
		double yard = 0.0277778;
		return getInches() * yard;
	}
	
	public double inchesToMiles() {
		return getInches() * 0.00001578;
	}
	
	public double inchesToMm() {
		return getInches() * 25.4;
	}
	
	public double inchesToCm() {
		return getInches() * 2.54;
	}
	
	public double inchesToMeter() {
		return getInches() * 0.0254;
	}
	
	public double inchesToKm() {
		return getInches() * 0.0000254;
	}
	
	//feet conversion methods
	public double feetToInches() {
		return getFeet() * 12;
	}
	
	public double feetToYard() {
		return getFeet() * 0.333333;
	}
	
	public double feetToMiles() {
		return getFeet() * 0.00018939375;
	}
	
	public double feetToMm() {
		return getFeet() * 304.8;
	}
	
	public double feetToCm() {
		return getFeet() * 30.48;
	}
	
	public double feetToMeter() {
		return getFeet() * 0.3048;
	}
	
	public double feetToKm() {
		return getFeet() * 0.0003048;
	}
	
	//yard conversion methods
	public double yardToInches() {
		return getYard() * 36;
	}
	
	public double yardToFeet() {
		return getYard() * 3;
	}
	
	public double yardToMiles() {
		return getYard() * 0.000568182;
	}
	
	public double yardToMm() {
		return getYard() * 914.4;
	}
	
	public double yardToCm() {
		return getYard() * 91.44;
	}
	
	public double yardToMeter() {
		return getYard() * 0.9144;
	}
	
	public double yardToKm() {
		return getYard() * 0.0009144;
	}
	
	//miles conversion methods
	public double milesToInches() {
		return getMiles() * 63360;
	}
	
	public double milesToFeet() {
		return getMiles() * 5280;
	}
	
	public double milesToYard() {
		return getMiles() * 1760;
	}
	
	public double milesToMm() {
		return getMiles() * 1609344;
	}
	
	public double milesToCm() {
		return getMiles() * 160934;
	}
	
	public double milesToMeter() {
		return getMiles() * 1609.34;
	}
	
	public double milesToKm() {
		return getMiles() * 1.60934;
	}
	
	//millimeters conversion methods
	public double mmToInches() {
		return getMiliMeters() * 0.0393701;
	}
	
	public double mmToFeet() {
		return getMiliMeters() * 0.00328084;
	}
	
	public double mmToYard() {
		return getMiliMeters() * 0.0010936133333333;
	}
	
	public double mmToMiles() {
		return getMiliMeters() * 0.000000621371;
	}
	
	public double mmToCm() {
		return getMiliMeters() * 0.1;
	}
	
	public double mmToMeter() {
		return getMiliMeters() * 0.001;
	}
	
	public double mmToKm() {
		return getMiliMeters() * 0.000001;
	}
	
	//centimeters conversion methods
	public double cmToInches() {
		return getCentiMeters() *  0.393701;
	}
	
	public double cmToFeet() {
		return getCentiMeters() *  0.0328084;
	}
	
	public double cmToYard() {
		return getCentiMeters() * 0.0109361;
	}
	
	public double cmToMiles() {
		return getCentiMeters() * 0.00000621371;
	}
	
	public double cmToMm() {
		return getCentiMeters() * 10;
	}
	
	public double cmToMeter() {
		return getCentiMeters() * 0.01;
	}
	
	public double cmToKm() {
		return getCentiMeters() * 0.00001;
	}
	
	//meters conversion methods
	public double meterToInches() {
		return getMeters() * 39.370079 ;
	}
	
	public double meterToFeet() {
		return getMeters() * 3.28084;
	}
	
	public double meterToYard() {
		return getMeters() * 1.093613;
	}
	
	public double meterToMiles() {
		return getMeters() * 0.000621371;
	}
	
	public double meterToMm() {
		return getMeters() * 1000;
	}
	
	public double meterToCm() {
		return getMeters() *  100;
	}
	
	public double meterToKm() {
		return getMeters() * 0.001;
	}
	
	//kilometers conversion methods
	public double kmToInches() {
		return getKilometer()  * 39370.07874;
	}
	
	public double kmToFeet() {
		return getKilometer() * 3280.839895;
	}
	
	public double kmToYard() {
		return getKilometer() * 1093.613298;
	}
	
	public double kmToMiles() {
		return getKilometer() * 0.621371;
	}
	
	public double kmToMm() {
		return getKilometer() * 1000000;
	}
	
	public double kmToCm() {
		return getKilometer() * 100000;
	}
	
	public double kmToMeter() {
		return getKilometer() * 1000;
	}
}

