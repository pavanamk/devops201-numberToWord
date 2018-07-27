/**
 * 
 */
package com.mindtree.main;

import java.util.Scanner;

import com.mindtree.service.ConvertNumber;

/**
 * @author Krithi
 *
 */
public class ConvertNumberMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("---Starting number conversion to word---");
		try {
			Scanner scanner=new Scanner(System.in);
			int input = 0;
			System.out.print("Enter a number(1-999) to convert(0 to exit): ");
			input=scanner.nextInt();
			while(input!=0) {
				if(input<1 || input>999) {
					System.out.print("Invalid argument passed.");
				}
				System.out.println("Result- "+ConvertNumber.getNumberToWord(input));
				
				System.out.print("Enter a number(1-999) to convert(0 to exit): ");
				input = scanner.nextInt();
			}
			
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.err.println("Invalid argument passed. Please verify the arguments!!");
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("Error while converting number to word!!");
		}
		System.out.println("---Exiting number conversion to word---");
	}

}
