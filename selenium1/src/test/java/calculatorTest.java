import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import selenium1.calculator;



public class calculatorTest {
	
	calculator cal = new calculator();
	
	/*@BeforeClass
	public static void before_class() {
		System.out.println("print before class excutes");
	}
	@AfterClass
	public static void after_class() {
		System.out.println("print after class excutes");
	}
	@Before
	public  void before_method() {
		System.out.println("print before test method");
	}
	@After
	public  void after_method() {
		System.out.println("print after test method");
	}
*/
	@Test
	public void testAdd1() {
		assertNotEquals(10,cal.add1(5, 5));
		
	}

	
	private void assertNotEquals(int i, int add1) {
		// TODO Auto-generated method stub
		
	}


	@Test
	public void testSub1() {
		assertNotEquals(0,cal.sub1(5, 5));
		
	}


}
