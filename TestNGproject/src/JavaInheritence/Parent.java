package JavaInheritence;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parent {
	
	
	public void dothis()
	{
		System.out.println("Parent inheritence");
	}
	
	@BeforeTest
	public void Before()
	{
		System.out.println("Before inheritence");
	}

}
