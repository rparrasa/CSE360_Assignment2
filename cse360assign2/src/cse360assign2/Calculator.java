//**************************************************//
// Name: Ricardo Parra
// Student ID: 1210591899
// ClassID: 522
// Assignment # 2
// Description: learn to use Github and make three different versions of a code
//***********************************************//

package cse360assign2;


public class Calculator {

	private int total;
	private String history = "0";


	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;	// returns total
	}
	
	public void add (int value) {
	 total = value + total;  // add parameter to total
	 
	  history = (getHistory() + " + " + value);
		
	}
	
	public void subtract (int value) {
		total = total - value; // subtracts parameter from the total
	   
		history = (getHistory() + " - " + value);
	}
	
	public void multiply (int value) {
		total = total * value; // Multiplies the parameter with the total
	
		history = (getHistory() + " * " + value);
	}
	
	public void divide (int value) {
	
		if (value == 0)// divides total by parameter and if parameter equals 0 then total equals 0.
		{
			total = 0;
		
		}
		else 
		{
			total = total/value;
		}
		
		history = (getHistory() + " / " + value);
	}
	
	public String getHistory () {
		

		return history;
			
	
		
	}
}