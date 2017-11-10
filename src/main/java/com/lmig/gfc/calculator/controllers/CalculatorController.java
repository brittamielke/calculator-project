package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {

	private Calculator calc;
	private double result;
	
	public CalculatorController() {
		calc = new Calculator();
	}

	@RequestMapping("/")
	public ModelAndView showApp(String firstNumber, String secondNumber, String operator) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		if (firstNumber !=null && firstNumber.length() > 0) {
//use this to check the console to see if it ever entered the if statement
			System.out.println("Im in the if");
			if (operator.equals("+")) {
				result = calc.add(firstNumber, secondNumber);
			}
			if (operator.equals("-")) {
				result = calc.subtract(firstNumber, secondNumber);
			}
			if (operator.equals("*")) {
				result = calc.multiply(firstNumber, secondNumber);
			}
			if (operator.equals("/")) {
				result = calc.divide(firstNumber, secondNumber);
			}
			if (operator.equals("^")) {
				result = calc.exponent(firstNumber, secondNumber);
			}
		}
		System.out.println(result);
		mv.addObject("firstNum", firstNumber);
		mv.addObject("secondNum", secondNumber);
		mv.addObject("operator", operator);
		mv.addObject("result", result);
		return mv;

	}
}