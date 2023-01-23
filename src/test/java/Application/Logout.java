package Application;

import org.testng.annotations.Test;

public class Logout 
{
	@Test
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
