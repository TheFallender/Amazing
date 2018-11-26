package com.amazing;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Filter { //Filter class
	public static final Scanner scan = new Scanner(System.in); //Scanner definition
	private static InputStream skipper = new ByteArrayInputStream("".getBytes()); //Skip the next input
	
	
	protected static int filter_i(String ask, int low, int high) { //Filters Int
		while (true) { //Keeps in the loop until it gets out with the return
			//Ask
			System.out.print(ask); //Ask string
			
			//Scan
			String input = scan.nextLine(); //Scan the next line
			
			//Filter
			try {  
				//Parse
				int val = Integer.parseInt(input); //Value to return
				
				//Limiters check
				if (low == high) { 			//No limit
					System.setIn(skipper); 		//Skip input
					return val;					//Return value
				}
				else { //There is a limit
					if (val >= low && val <= high) { //Check if the integer is valid
						System.setIn(skipper); 			//Skip input
						return val;						//Return value
					}
					else //Error, out of limit
						System.out.println("ERROR - The interger has to be between " + low + " and " + high + "."); //Reports that the integer isn't between the values
				}
			}  
			catch(NumberFormatException e) { //Not a valid number
				System.out.println("ERROR - You must enter an integer."); //Reports that the input is not an integer
			}
		}
	}
	
	protected static float filter_f(String ask, float low, float high, int decimal_slots) { //Filters Float
		while (true) { //Keeps in the loop until it gets out with the return
			//Ask
			System.out.print(ask); //Ask string
			
			//Scan
			String input = scan.nextLine(); //Scan the next line
			String format = "%." + decimal_slots + "f";
			
			//Filter
			try {  
				//Parse
				Float val = Float.parseFloat(input); //Value to return
				
				//Decimal format
				if (decimal_slots != 0) { //There is a decimal slot defined
					input = String.format (format, val); //Format the string
					val = Float.parseFloat(input); //Parse again to obtain the reduced value
				}
				
				//Limiters check
				if (low == high) { 			//No limit
					System.setIn(skipper); 		//Skip input
					return val;					//Return value
				}
				else { //There is a limit
					if (val >= low && val <= high) { 	//Check if the integer is valid
						System.setIn(skipper); 				//Skip input
						return val;							//Return value
					}
					else //Error, out of limit
						System.out.println("ERROR - The value has to be between " + low + " and " + high + "."); //Reports that the integer isn't between the values
				}
			}  
			catch(NumberFormatException e)  { //Not a valid number
				System.out.println("ERROR - You must enter valid value."); //Reports that the input is not an integer
			}
		}
	}
	
	protected static String filter_s(String ask) { //Filters Strings
		System.out.print(ask); 		//Ask string
		return scan.nextLine(); 	//Return the next line
	}
}
