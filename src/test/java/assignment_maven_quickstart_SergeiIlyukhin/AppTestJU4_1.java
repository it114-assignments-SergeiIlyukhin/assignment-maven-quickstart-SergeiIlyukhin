package assignment_maven_quickstart_SergeiIlyukhin;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTestJU4_1 {
	private String  name;
	private Integer age;
	private App     app;
		
	public static Integer age2add = 9;
	public static String  strAge2add = "6";
	public static String  exceptionStrAge2add = "here";
	
	public static final String  DEFAULT_NAME = "bill";
	public static final Integer DEFAULT_AGE = 19;
	
	
	public static void setUpBeforeClass() throws Exception {
		
	}

	
	public static void tearDownAfterClass() throws Exception {
		
	}

	
	public void setUp() throws Exception {
		System.out.println("BEF setUp of AppTestJU4_1");
		name = AppTestJU4_1.DEFAULT_NAME;
		age = AppTestJU4_1.DEFAULT_AGE;
		app = new App(name, age);
	}

	
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testApp() {
		App app1 = new App();
		assertEquals("Name has not been initialized to expected value:" + App.NAME , App.NAME, app1.getName());
		assertEquals("Age  has not been initialized to expected value:" + App.AGE ,  App.AGE,  app1.getAge());

	}


	public void testAppStringInteger() {
		App app1 = new App(name, age);
		assertEquals("Name has not been initialized to expected value:" + name , name, app1.getName());
		assertEquals("Age  has not been initialized to expected value:" + age ,  age, app1.getAge());

	}

	
	public void testAdd2ageInteger() {
		Integer expected = age + age2add;
		Integer actual = app.add2age(age2add);
		assertEquals("add2age did not add " + age2add + " correctly", expected, actual);

	}
	
	
	public void testAdd2ageString() {
		Integer expected = age + Integer.parseInt(strAge2add);
		Integer actual = app.add2age(strAge2add);
		assertEquals("add2age did not add " + strAge2add + " correctly", expected, actual);		

	
	
		

	}

	
	public final ExpectedException expectedException = ExpectedException.none();
	
	public void testAdd2ageStringCannotParse2IntegerException2(){
		
	}

	
	public void testAdd2ageStringCannotParse2IntegerException3() {
		
		}
	
	
	
	public void testPrefixedName() {
				
	}

}
