/**
*prog : Factorial of 5
*Author : Deeksha Sethi
*Date : 07-09-2018
*Desc : TDD based app to find out the factorial of a number
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest{

	@Test
	public void evaluateFactorial(){
	int result;
		Factorial obj= new Factorial();
		result=obj.calculateFactorial();
		assertEquals(120,result);
	}
}


