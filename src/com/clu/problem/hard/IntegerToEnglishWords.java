package com.clu.problem.hard;

public class IntegerToEnglishWords {
	
	public static void main(String[] args) {
		IntegerToEnglishWords solution = new IntegerToEnglishWords();
		int number = 0;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 1;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 10;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 12;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 15;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 20;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 23;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 101;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 123;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 201;
		System.out.println(number + " English Words = " + solution.numberToWords(number));
		number = 1000;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 1234;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 12345;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 123456;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 1000000;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 1000010;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 1234567;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 12345678;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 123456789;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

		number = 1234567891;
		System.out.println(number + " English Words = " + solution.numberToWords(number));

	}
	
    public String numberToWords(int num) {

    	if (num == 0) {
    		return "Zero";
    	} else if (num <= 9 && num >= 1) {
    		return this.covert1To9(num);
    	} else if (num >= 10 && num <= 19)  {
    		return this.convert10to19(num);
    	} else if (num >= 20 && num <= 99) {
    		return this.convert20To99(num);
    	} else if (num>= 100 && num <= 999){
    		return this.convert100To999(num);
    	} else if (num>= 1000 && num <= 999999){
    		return this.convert1000To999999(num);
    	} else if (num>=1000000 && num <= 999999999){
    		return this.convert1000000To99999999(num);
    	} else {
    		return this.convertGe1000000000(num);
    	}

    }
    
    public String convertGe1000000000(int num) {
    	int leftNumber = num/1000000000;
    	int rightNumber = num%1000000000;
    	String leftString = convert100To999(leftNumber) ;
    	if (leftString != null && leftString.trim() != "") {
    		leftString = leftString + " Billion ";
    	}
    	String response =  leftString + this.convert1000000To99999999(rightNumber);
    	return response.trim();
    }
    
    public String convert1000000To99999999(int num) {
    	if (num == 0) {
    		return "";
    	}
    	int leftNumber = num/1000000;
    	int rightNumber = num%1000000;
    	String leftString = convert100To999(leftNumber);
    	if (leftString != null && leftString.trim() != "") {
    		leftString = leftString + " Million ";
    	}
    	String response =  leftString + this.convert1000To999999(rightNumber);
    	return response.trim();
    }
    
    public String convert1000To999999(int num) {
    	if (num == 0) {
    		return "";
    	}
    	int leftNumber = num/1000;
    	int rightNumber = num%1000;
    	String leftString =  convert100To999(leftNumber);
    	if (leftString != null && leftString.trim() != "") {
    		leftString = leftString + " Thousand ";
    	}
    	String response = leftString + this.convert100To999(rightNumber);
    	
    	return response.trim();
    }
    
    public String convert100To999(int num) {

       	int leftNumber = num/100;
    	int rightDigit = num%100;

    	if (num == 0) {
    		return "";
    	} else if (num <= 9 && num >= 1) {
    		return covert1To9(num);
    	} else if (num >= 10 && num <= 19) {
    		return convert10to19(num);
    	} else if (num >= 20 && num <= 99) {
    		return convert20To99(num);
    	} else if (rightDigit >= 0 && rightDigit <= 9){

        	String response = covert1To9(leftNumber) + " Hundred " + this.covert1To9(rightDigit);
        	return response.trim();
    	} else if (rightDigit >= 10 && rightDigit <= 19) {

        	String response = covert1To9(leftNumber) + " Hundred " + this.convert10to19(rightDigit);
        	return response.trim();
    	} else {

        	String response = covert1To9(leftNumber) + " Hundred " + this.convert20To99(rightDigit);
        	return response.trim();
    	}
	
    }
    
    public String convert20To99(int num) {
    	if (num == 0) {
    		return "";
    	}
    	int leftDigit = num/10;
    	int rightDigit = num%10;

    	String response = "";
    	if (leftDigit == 2) {
    		response = "Twenty " + covert1To9(rightDigit);
    	} else if (leftDigit == 3) {
    		response =  "Thirty " + covert1To9(rightDigit);
    	} else if (leftDigit == 4) {
    		response =  "Forty " + covert1To9(rightDigit);
    	} else if (leftDigit == 5) {
    		response =  "Fifty " + covert1To9(rightDigit);
    	} else if (leftDigit == 6) {
    		response =  "Sixty " + covert1To9(rightDigit);
    	} else if (leftDigit == 7) {
    		response =  "Seventy " + covert1To9(rightDigit);
    	} else if (leftDigit == 8) {
    		response =  "Eighty " + covert1To9(rightDigit);
    	} else if (leftDigit == 9) {
    		response =  "Ninety " + covert1To9(rightDigit);
    	} else {
    		response = "";
    	}
    	
    	return response.trim();
    }
    
    public String convert10to19(int num) {
 
    	if (num == 0) {
    		return "";
    	}
    	if (num == 10) {
    		return "Ten";
    	} else if (num == 11) {
    		return "Eleven";
    	} else if (num == 12) {
    		return "Twelve";
    	} else if (num == 13) {
    		return "Thirteen";
    	} else if (num == 14) {
    		return "Fourteen";
    	} else if (num == 15) {
    		return "Fifteen";
    	} else if (num == 16) {
    		return "Sixteen";
    	} else if (num == 17) {
    		return "Seventeen";
    	} else if (num == 18) {
    		return "Eighteen";
    	} else if (num == 19){
    		return "Nineteen";
    	} else {
    		return "";
    	}
    }

    

    
    public String covert1To9(int num) {
    	if (num == 0) {
    		return "";
    	}
    	if (num == 1) {
    		return "One";
    	} else if (num == 2) {
    		return "Two";
    	} else if (num == 3) {
    		return "Three";
    	} else if (num == 4) {
    		return "Four";
    	} else if (num == 5) {
    		return "Five";
    	} else if (num == 6) {
    		return "Six";
    	} else if (num == 7) {
    		return "Seven";
    	} else if (num == 8) {
    		return "Eight";
    	} else if (num == 9) {
    		return "Nine";
    	} else {
    		return "";
    	}	
    }

}
