import helloworld.HelloWorld;
import org.junit.Test;

public class HelloWorldJunit
{
	
	@Test
	public void helloWorldTest() 
	{
		HelloWorld hw =new HelloWorld();
		String name=hw.isName("YashK");
		System.out.println("Hello World "+name+" !!");
	}
	
}
