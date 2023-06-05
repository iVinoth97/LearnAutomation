package testNgExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationEg {
	@Test
	@Parameters("Name, ")
	public void printName(String name){
		System.out.println("Name is "+ name);
	}
}

