package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Calculator {

	private ArrayList<String> resultList;

	public Calculator() {
		resultList = new ArrayList<String>();
	}

	public double add(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		resultList.add(0,(firstNumber + " + " + secondNumber + " = " + result));
		return result;
	}

	public double subtract(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		resultList.add(0,(firstNumber + " - " + secondNumber + " = " + result));
		return result;
	}

	public double multiply(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		resultList.add(0, (firstNumber + " * " + secondNumber + " = " + result));
		return result;
	}

	public double divide(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		resultList.add(0, (firstNumber + " / " + secondNumber + " = " + result));
		return result;
	}

	public double exponent(double firstNumber, double secondNumber) {
		double result = Math.pow(firstNumber, secondNumber);
		resultList.add(0, (firstNumber + " ^ " + secondNumber + " = " + result));
		return result;
	}

	public ArrayList<String> getResultList() {
		return resultList;
	}
	
}
