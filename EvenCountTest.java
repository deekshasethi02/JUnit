import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EvenCountTest{

	@Test
	public void calculateNumberOfEvenDigits(){
	int even_count;
		 
		EvenOddCount obj= new EvenOddCount();
		 even_count = obj.calculateEvenCount();
		 assertEquals(2,even_count);
		
	}

	@Test
	public void calculateNumberOfOddDigits(){
	int odd_count;
		 
		EvenOddCount obj= new EvenOddCount();
		 odd_count = obj.calculateOddCount(); 
		 assertEquals(5,odd_count);

	}

}
