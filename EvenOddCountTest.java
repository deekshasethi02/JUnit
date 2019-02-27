/**
*prog :Total count of even and odd digits
*Author : Deeksha Sethi
*Date : 07-09-2018
*Desc : TDD based app to find out total count of even and odd digits in a number
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EvenOddCountTest{

	@Test
	public void calculateNumberOfEvenDigits(){
	int even_count;
		 
		EvenOddCount ec= new EvenOddCount();
		 even_count = ec.calculateEvenCount();
		 assertEquals(4,even_count);
		
	}

	@Test
	public void calculateNumberOfOddDigits(){
	int odd_count;
		 
		EvenOddCount oc= new EvenOddCount();
		 odd_count = oc.calculateOddCount(); 
		 assertEquals(5,odd_count);

	}

}
