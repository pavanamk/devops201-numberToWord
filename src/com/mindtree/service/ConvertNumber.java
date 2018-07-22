package com.mindtree.service;

public class ConvertNumber {

	private static final String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine" ,"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

	private static String tensPlace[]= {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	

	public static String getNumberToWord(int number) throws Exception {
		String word="";
		if(number>999 || number<0) {
			throw new Exception("Number cannot be converted");
		}
		if(number==0) {
			return digits[0];
		}
		int temp=number/100;
		if(temp>0) {
			word+=digits[temp]+" hundred";
		}
		temp=number%100;
		if(temp<20 && temp>0) {
			word+=" " +digits[temp];
		}else {
			word +=" " + tensPlace[temp / 10];
			if ((number % 10) > 0) {
				word += " " + digits[temp % 10];
			}
		}
		return word;
	}

}
