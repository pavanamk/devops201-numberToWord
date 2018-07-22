/**
 * 
 */
package com.mindtree.main;

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

		if(args.length<1) {
			System.out.println("Atlease a single argument should be passed!!");
			return;
		}
		
		try {
			System.out.println("Starting conversion");
			for (int i = 0; i < args.length; i++) {
				int number= Integer.parseInt(args[i]);
				System.out.println(args[i]+"- "+ConvertNumber.getNumberToWord(number));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.err.println("Invalid argument passed. Please verify the arguments!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error while converting number to word!!");
		}
	}

}
