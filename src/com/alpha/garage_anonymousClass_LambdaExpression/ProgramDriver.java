package com.alpha.garage_anonymousClass_LambdaExpression;

public class ProgramDriver {
	public static void main(String[] args) {
//		Lambda Expression
		Engine petrolEngine = () -> {
			System.out.println("Starting Petrol Engine");
		};

		Engine dieselEngine = () -> System.out.println("Starting Diesel Engine");
		Engine cngEngine = () -> System.out.println("Starting CNG Engine");
		
		petrolEngine.start();
		dieselEngine.start();
		cngEngine.start(); // Starting CNG Engine
		
		System.out.println(petrolEngine);
		System.out.println(dieselEngine);
		System.out.println(cngEngine); //com.alpha.garage_anonymousClass.ProgramDriver$$Lambda/0x0000020f81002220@4783da3f
		
	}
}

/*
		//Anonymous Class
public static void main(String[] args) {
		Engine petrolEngine=new Engine() {
			@Override
			public void start() {
				System.out.println("Starting Petrol Engine");
			}
			@Override
			public void stop() {
				System.out.println("Stopping Petrol Engine");
			}
		};
		Engine dieselEngine=new Engine() {
			@Override
			public void start() {
				System.out.println("Starting Diesel Engine");
			}
			@Override
			public void stop() {
				System.out.println("Stopping Diesel Engine");
			}
		};
		Engine cngEngine=new Engine() {
			@Override
			public void start() {
				System.out.println("Starting CNG Engine");
			}
			@Override
			public void stop() {
				System.out.println("Stopping CNG Engine");
			}
		};
		petrolEngine.start();
		petrolEngine.stop();
		dieselEngine.start();
		dieselEngine.stop();
		cngEngine.start();
		cngEngine.stop();
		System.out.println(petrolEngine);
		System.out.println(dieselEngine);
		System.out.println(cngEngine);
	}
*/