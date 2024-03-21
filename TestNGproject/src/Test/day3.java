package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	

	@Test(groups= {"Smoke"})
	public void Homeloan()
	{
		System.out.println("Smoke3");
	}
	
	@Test
	public void HomeloanLowIntrest()
	{
		System.out.println("HomeloanLowIntrest");
	}
	
	@Test
	public void HomeloanHighIntrest1()
	{
		System.out.println("HomeloanHighIntrest");
	}
	
	@Test
	public void HomeloanHighIntrest2()
	{
		System.out.println("HomeloanHighIntrest");
	}
	
	@Test
	public void HomeloanHighIntrest3()
	{
		System.out.println("HomeloanHighIntrest");
	}
	
	@Test
	public void HomeloanHighIntrest()
	{
		System.out.println("HomeloanHighIntrest");
	}

}
