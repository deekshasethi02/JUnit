/**
*prog :Sum of integers between 100 to 200 that are  divisible by 7
*Author : Deeksha Sethi
*Date : 07-09-2018
*Desc : TDD based app to find out sum of integers between 100 to 200 that are  divisible by 7
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumOfIntegersTest{
	@Test
	public void evaluateSumOfIntegersDivBy7(){
		SumOfIntegers obj = new SumOfIntegers();
		int ans = obj.calculateSumOfIntegersDivBy7();
		assertEquals(2107,ans);
	}

}
