package com.siyaram;

public class TestProbability {
	public static void main(String[] args) {
		GenerateProbability gp = new GenerateProbability();
		for(int i=0;i<10;i++)
		{
			System.out.println("value is : "+gp.getTrueFalse_HalfTime());	
		}
	}

}
