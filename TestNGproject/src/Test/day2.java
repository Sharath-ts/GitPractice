package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void Carloan()
	{
		System.out.println("Smoke2");
	}
	
	@Test
	public void CarloanLowIntrest()
	{
		System.out.println("CarloanLowIntrest");
	}
	
	@BeforeTest
	public void CarloanHighIntrest()
	{
		System.out.println("Before Test CarloanHighIntrest");
	}
}
