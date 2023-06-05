package testNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEg {
	
//Assertion is Primarily used for unit testing
	
	String name="TATA";
	boolean value=true;

	@Test
	public void checkEqual(){
	/*if(name.equals("Tata")){
	System.out.println("Name is equal");
}else{
	System.out.println("Name is NOT equal");
}*/

Assert.assertTrue(value, "This should not be true");
}
}