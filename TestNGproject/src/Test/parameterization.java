package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	
	
	
	@Parameters({"URL","USERNAME","PASSWORD"})
	@Test
	public void Goods(String url,String username,String password) 
	{
		System.out.println("Goods Tender");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	
	@Test(dataProvider="getdata")
	public void Randamization(String usern, String pass) 
	{
		System.out.println("Randamization Tender");
		System.out.println(usern);
		System.out.println(pass);
		
	}
	
	@DataProvider
	public Object[][] getdata() 
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "FirstUsername";
		data[0][1] = "pass1";
		
		data[1][0] = "SecongUsername";
		data[1][1] = "pass2";
		
		data[2][0] = "ThirdUsername";
		data[2][1] = "pass3";
		return data;
		
	
	}

}
