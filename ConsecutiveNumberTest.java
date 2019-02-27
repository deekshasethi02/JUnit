/**
*prog : Addition of 10 consecutive numbers
*Author : Deeksha Sethi
*Date : 07-09-2018
*Desc : TDD based app to find out addition of 10 consecutive numbers
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConsecutiveNumberTest{

	@Test
	public void evaluateSumOf10ConsecutiveNumber(){
	int result;
		ConsecutiveNumber obj= new ConsecutiveNumber();
		result=obj.calculateSumOfConsecutiveNumbers();
		assertEquals(55,result);
	}
}
