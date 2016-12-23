package com.siyaram;

import java.util.Random;
public class GenerateProbability {
	Boolean getTrueFalse_HalfTime(){
		 Random rand = new Random();
		 int number = rand.nextInt(3)+1;
		 if(number==1)
		 {
			 return Boolean.TRUE;
		 }
		 else {
			 return Boolean.FALSE;
		 }
	}
}
