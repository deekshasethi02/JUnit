/**
*prog : To convert into binary equant
*Author : Deeksha Sethi
*Date : 07-09-2018
*Desc : TDD based app to convert a number into binary equant
*/


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class ConvertToBinaryTest{
	@Test
	
	public void evaluateBinaryEquantOf17(){
	ConvertToBinary cb = new ConvertToBinary();
	String ans = cb.calculateBinaryEquantOf17();
	assertEquals("10001",ans);

	}

}
