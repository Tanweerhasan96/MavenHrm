package Application;

import org.testng.annotations.Test;

public class LoginTest 
{
	@Test(groups="smoke")
	public void loginApp()
	{
		System.out.println("login");
	}
	@Test
	public void openBrowser()
	{
		System.out.println("openBrowser");
	}

}
