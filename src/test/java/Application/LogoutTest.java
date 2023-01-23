package Application;

import org.testng.annotations.Test;

public class LogoutTest 
{
	@Test(groups="regression")
	public void closeBrowser()
	{
		System.out.println("CloseBrowser");
	}
	@Test(groups="smoke")
	public void logout()
	{
		System.out.println("logout");
	}

}
