/**
*prog :Sum of digits in a expression
*Author : Deeksha Sethi
*Date : 07-09-2018
*Desc : TDD based app to find out sum of digits in an expression
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumOfExpressionTest{
@Test

public void evaluateSumOfExpression(){
	int result;
	SumOfExpression obj= new SumOfExpression();
	result= obj.calculateSum();
	assertEquals(9,result);
	
}


}
