package com.org.Overriding;

public class Overriding {

	void color() {
		System.out.println("Vegetables Color " );
	I
	}
}
	class Brinjal extends Overriding{
		@Override
		void color() {
			System.out.println("Brinjal Color is BlueViolet");
		
		
		}
	}
	
	class Tomato extends Overriding{
		@Override
		void color() {
			System.out.println("Tomato Color is Red");
		}
	}

