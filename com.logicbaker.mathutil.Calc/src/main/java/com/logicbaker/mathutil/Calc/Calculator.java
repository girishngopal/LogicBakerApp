package com.logicbaker.mathutil.Calc;

import com.logicbaker.mathutil.adder.Adder;
import com.mycompany.com.logicbaker.mathutil.substract.Sub;
import com.mycompany.com.logicbaker.mathutil.multiply.Mul;
import com.mycompany.com.logicbaker.mathutil.divide.Div;
public class Calculator {
	
	
	public static void main(String args[]){
		
	/*	Abs abs = new Abs();
		System.out.println(abs.value(10.001893129));*/
		Sub s;
                s = new Sub();
		Adder adder = new Adder();
                Mul m=new Mul();
                Div d=new Div();
		System.out.println("add="+Adder.add(1, 3));
		System.out.println("sub="+s.sub(4, 1));
                System.out.println("mul="+m.mul(4, 4));
                System.out.println("div="+d.div(8, 2));


	}

}
