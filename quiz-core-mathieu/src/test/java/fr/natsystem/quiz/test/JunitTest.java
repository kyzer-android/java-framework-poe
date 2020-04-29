package fr.natsystem.quiz.test;

import org.junit.*;

public class JunitTest {
	
	@BeforeClass
	public static void beforeall() {
		System.out.println("BeforeAll");
	}
	@AfterClass
	public static void afterall() {
		System.out.println("AfterAll");
	}
	@Before
	public void before() {
		System.out.println("Before");
	}
	@After
	public void after() {
		System.out.println("After");
	}
	@Test
	public void test() {
		System.out.println("Test");
	}

}
