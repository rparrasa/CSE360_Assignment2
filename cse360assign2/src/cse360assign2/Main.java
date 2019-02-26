package cse360assign2;


public class Main{
	public static void main(String[] args) {
	
		System.out.println("hello world!!!\n");
		
		Calculator calc = new Calculator();
		
		calc.add(6);
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(4);
		System.out.println(calc.getTotal());
		  
	}
}