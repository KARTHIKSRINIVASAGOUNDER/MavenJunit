import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest1 {

	@Test//(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    MyClass tester = new MyClass();
	    tester.add(1000, 5);
	  }

	  @Test
	  public void test1Multiply() {
	    MyClass tester = new MyClass();
	    assertEquals("Addition of 1 + 5", 6, tester.add(1, 5));
	  }
	  
	  @Test(expected=java.lang.ArithmeticException.class)
		public void testDiv() {
			MyClass tester = new MyClass();
			tester.div(1000, 0);
		}
	  
	  @Test
		public void testFirstFeature()
		{
			    MyClass tester = new MyClass();
			    assertEquals("Addition of 1 + 5", 6, tester.add(1, 5));
		}
	  @BeforeClass
		public static void beforeClass() {
			System.out.println("Initialize variables/set up some pre start up tasks");

		}

		@AfterClass
		public static void afterClass() {
			System.out.println("Perform post action clean up tasks");
		}

		@Test // (expected = IllegalArgumentException.class)
		public void testExceptionIsThrown1() {
			MyClass tester = new MyClass();
			tester.add(1000, 5);
		}

		@Test
		public void test1Multiply1() {
			MyClass tester = new MyClass();
			assertEquals("Addition of 1 + 5", 6, tester.add(1, 5));
		}

		@Test(expected = java.lang.ArithmeticException.class)
		public void testDiv1() {
			MyClass tester = new MyClass();
			tester.div(1000, 0);
		}
}
