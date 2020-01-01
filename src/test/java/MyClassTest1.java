import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


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
		
	/*	//Mockito
		@Test
		public void test1Mockito()  {
		        //  create mock
		        MyClass test = Mockito.mock(MyClass.class);

		        // define return value for method getUniqueId()
		        Mockito.when(test.getUniqueId()).thenReturn(44);

		        // use mock in test....
		        assertEquals(test.getUniqueId(), 44);
		}
		// demonstrates the return of multiple values
		@Test
		public void testMoreThanOneReturnValueMockito()  {
		        Iterator<String> i= Mockito.mock(Iterator.class);
		        Mockito.when(i.next()).thenReturn("Mockito").thenReturn("rocks");
		        String result= i.next()+" "+i.next();
		        //assert
		        assertEquals("Mockito rocks", result);
		}
		
		// this test demonstrates how to return values based on the input
		@Test
		public void testReturnValueDependentOnMethodParameter()  {
		        Comparable<String> c= Mockito.mock(Comparable.class);
		        Mockito.when(c.compareTo("Mockito")).thenReturn(1);
		        Mockito.when(c.compareTo("Eclipse")).thenReturn(2);
		        //assert
		        assertEquals(1, c.compareTo("Mockito"));
		}

		// this test demonstrates how to return values independent of the input value

		@Test
		public void testReturnValueInDependentOnMethodParameter()  {
		        Comparable<Integer> c= Mockito.mock(Comparable.class);
		        Mockito.when(c.compareTo(Mockito.anyInt())).thenReturn(-1);
		        //assert
		        assertEquals(-1, c.compareTo(9));
		}
		
		// return a value based on the type of the provide parameter

		@Test
		public void testReturnValueInDependentOnMethodParameter2()  {
		        Comparable<MyClass> c= Mockito.mock(Comparable.class);
		        Mockito.when(c.compareTo(Mockito.isA(MyClass.class))).thenReturn(0);
		        //assert
		        assertEquals(0, c.compareTo(new MyClass()));
		}
		
		@Test
		public void testVerify()  {
		    // create and configure mock
		    MyClass test = Mockito.mock(MyClass.class);
		    Mockito.when(test.getUniqueId()).thenReturn(44);


		    // call method testing on the mock with parameter 12
		    test.testing(12);
		    test.getUniqueId();
		    test.getUniqueId();


		    // now check if method testing was called with the parameter 12
		    Mockito.verify(test).testing(ArgumentMatchers.eq(12));

		    // was the method called twice?
		    Mockito.verify(test, Mockito.times(2)).getUniqueId();

		    // other alternatives for verifiying the number of method calls for a method
*//*		    verify(test, never()).someMethod("never called");
		    verify(test, atLeastOnce()).someMethod("called at least once");
		    verify(test, atLeast(2)).someMethod("called at least twice");
		    verify(test, times(5)).someMethod("called five times");
		    verify(test, atMost(3)).someMethod("called at most 3 times");*//*
		    // This let's you check that no other methods where called on this object.
		    // You call it after you have verified the expected method calls.
		    Mockito.verifyNoMoreInteractions(test);
		}*/
}
