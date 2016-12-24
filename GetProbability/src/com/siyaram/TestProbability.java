package com.siyaram;

import org.omg.CORBA.TRANSACTION_UNAVAILABLE;

public class TestProbability {
	public static void main(String[] args) {
		GenerateProbability gp = new GenerateProbability();
		TestProbability tp = new TestProbability();
		int i_true=0;
		int j_false=0;
		double percentage=0.00;
		
		for(int i=0;i<10000;i++)
		{
			Boolean flag = gp.getTrue_ThreeFourthTime();
			if(flag){
				i_true++;
			}
			else{
				j_false++;
			}
		}
		/*calculate % of the time function returns true*/
		percentage = ((double)i_true/(double)(i_true+j_false))*100;
		percentage = tp.truncateDigits(percentage);
		
		System.out.println("Function getTrue_ThreeFourthTime returns true "+percentage+"% Times");
	}
	
	Double truncateDigits(double perc){
		Integer integral=0;
		double fractionalPart;
		Integer fractionalInt;
		double result;
		integral = (int)perc;  //78.9992--> 78 add it as double
		fractionalPart = perc - integral;
		fractionalPart= fractionalPart*100;
		fractionalInt = (int) fractionalPart;
		fractionalPart = (double)fractionalInt/100;  //add it as double
		
		result = (double)integral + fractionalPart;		
		return result; 
	}

}
