package testNgExamples;

import org.testng.annotations.Test;

public class DependencyManagenment {

	@Test(priority = 0)
	public void SSLC() {
		System.out.println("Grade 10");
	}
	@Test(dependsOnMethods = "SSLC")
	public void HSC() {
		System.out.println("Grade 12");
	}
	@Test(dependsOnMethods = "HSC")
	public void College() {
		System.out.println("Degree");
	}
}
