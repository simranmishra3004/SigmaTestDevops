import helloworld.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest
{
	
	@Test
	public void helloWorldTest() 
	{
		HelloWorld hw =new HelloWorld();
		String name=hw.isName("Simran");
		System.out.println("Hello World "+name+" !!");
		assertSame("Simran", name);
	}
	
}
