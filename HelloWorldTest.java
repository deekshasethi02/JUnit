import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HelloWorldTest{
@Test
public void evaluateReturnedMessage(){
	
	HelloWorldDemo hwDemo= new HelloWorldDemo();
	String msg=hwDemo.sayHello();
	assertEquals("hello world",msg);
}
}