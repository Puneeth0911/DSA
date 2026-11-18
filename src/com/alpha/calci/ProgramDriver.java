package com.alpha.calci;

public class ProgramDriver {
	public static void main(String[] args) {
		Calculator add=(int a,int b)-> {
			return a+b;
		};
		System.out.println(add.calculate(10, 20));
		
		Calculator substraction=(int a,int b)-> {
			return a-b;
		};
		System.out.println(substraction.calculate(10, 20));
		
		Calculator multiply=(int a,int b)-> {
			return a*b;
		};
		System.out.println(multiply.calculate(10, 20));
		Calculator divide=(int a,int b)-> {
			return a/b;
		};
		System.out.println(divide.calculate(10, 20));
	}
}
