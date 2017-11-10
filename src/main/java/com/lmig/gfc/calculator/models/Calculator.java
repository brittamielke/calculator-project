package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Calculator {

	private ArrayList<String> resultList;

	public Calculator() {
		resultList = new ArrayList<String>();
	}

	public double add(String firstNumber, String secondNumber) {
		double result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
		resultList.add(0,(firstNumber + " + " + secondNumber + " = " + result));
		return result;
	}

	public double subtract(String firstNumber, String secondNumber) {
		double result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
		resultList.add(0,(firstNumber + " - " + secondNumber + " = " + result));
		return result;
	}

	public double multiply(String firstNumber, String secondNumber) {
		double result = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
		resultList.add(0, (firstNumber + " * " + secondNumber + " = " + result));
		return result;
	}

	public double divide(String firstNumber, String secondNumber) {
		double result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
		resultList.add(0, (firstNumber + " / " + secondNumber + " = " + result));
		return result;
	}

	public double exponent(String firstNumber, String secondNumber) {
		double result = Math.pow(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
		resultList.add(0, (firstNumber + " ^ " + secondNumber + " = " + result));
		return result;
	}

	public ArrayList<String> getResultList() {
		return resultList;
	}
	
}
