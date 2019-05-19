package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestExample {
	
	
    @BeforeTest
	public void initialize() {

		System.out.println("Before Test");
	}
   
    @Test
	public void method1() {

		System.out.println("method/Test 1");
	}
    
    @Test
	public void method2() {

		System.out.println("method/Test 2");
	}
     @AfterTest
	public void teardown() {

		System.out.println("after Test");
	}

}
