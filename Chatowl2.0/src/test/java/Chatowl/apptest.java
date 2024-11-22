package Chatowl;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;


public class apptest {

 @Test
	public void testlogin1()
	{
		app myapp=new app();
		AssertJUnit.assertEquals(0,myapp.username("ABC", "abc123"));
	}
	
	@Test
	public void testlogin3()
	{
		app myapp=new app();
		AssertJUnit.assertEquals(1,myapp.username("ABC", "abc@123"));
	}
	
}



