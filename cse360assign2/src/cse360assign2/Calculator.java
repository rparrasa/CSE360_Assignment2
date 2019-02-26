package cse360assign2;

public class Calculator {

	private int total;

	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;	// returns total
	}
	
	public void add (int value) {
	 total = value + total;  // add parameter to total
	}
	
	public void subtract (int value) {
		total = total - value; // subtracts parameter from the total
	}
	
	public void multiply (int value) {
		total = total * value; // Multiplies the parameter with the total
	}
	
	public void divide (int value) {
	
		if (value == 0) // divides total by parameter and if parameter equals 0 then total equals 0.
		{
			total = 0;
		
		}
		else 
		{
			total = total/value;
		}
	}
	
	public String getHistory () {
		return ""; 
	}
}