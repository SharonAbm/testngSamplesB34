package testScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
	@Test(groups="featureOne")
	public void testOne() {
		System.out.println("Test41 is SampleThree");
	}
	@Test(groups="featureTwo")
	public void testTwo() {
		System.out.println("Test42 is SampleThree");
	}
	@Test(groups="featureThree")
	public void testThree() {
		System.out.println("Test43 is SampleThree");
	}
	@Test(groups="featureFour")
	public void testFour() {
		System.out.println("Test44 is SampleThree");
	}



}
