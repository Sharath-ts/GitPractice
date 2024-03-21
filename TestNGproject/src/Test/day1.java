package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups= {"Smoke"})
	public void PersonalLoan() {
		System.out.println("Smoke1");
	}

	@Test
	public void PersonalLoanLow() {
		System.out.println("PersonalLoanLow");
	}

	@Test
	public void PersonalLoanHigh() {
		System.out.println("PersonalLoanHigh");
	}
	
	@Test
	public void PersonalLoanHigh1() {
		System.out.println("PersonalLoanHigh1");
	}
	
	@Test
	public void PersonalLoanHigh2() {
		System.out.println("PersonalLoanHigh2");
	}

}
