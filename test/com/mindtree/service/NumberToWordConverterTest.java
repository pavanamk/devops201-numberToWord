/**
 * 
 */
package com.mindtree.service;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Test;

/**
 * @author Krithi
 *
 */
class NumberToWordConverterTest {

	@Test
	void testValidNumbers() {
		String input;
		try {

			String path=getClass().getClassLoader().getResource("").getPath();
			System.out.println("Input file path:"+path);
			File fin = new File(path.substring(1)+File.separator+"input_file.txt");
			FileReader reader = new FileReader(fin);
			BufferedReader bufferedReader = new BufferedReader(reader);
			while ((input = bufferedReader.readLine()) != null) {
				String temp[] = input.split("-");
				String output=ConvertNumber.getNumberToWord(Integer.parseInt(temp[0])).trim();
				assertTrue(temp[1].trim().equalsIgnoreCase(output));
			}
			bufferedReader.close();

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	void testInvalidInputPositiveNumbers() {
		try {
			ConvertNumber.getNumberToWord(1000);
			fail("Exception was expected");
		}catch(Exception e) {
			assertTrue("Number cannot be converted".equals(e.getMessage()));
		}
	}
	
	@Test
	void testInvalidInputNegativeNumbers() {
		try {
			ConvertNumber.getNumberToWord(-1);
			fail("Exception was expected");
		}catch(Exception e) {
			assertTrue("Number cannot be converted".equals(e.getMessage()));
		}
	}
}
