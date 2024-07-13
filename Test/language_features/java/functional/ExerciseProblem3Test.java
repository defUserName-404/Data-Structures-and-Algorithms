package language_features.java.functional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseProblem3Test {

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(originalOut);
	}

	@Test
	public void testPrintCoursesWithEmptyList() {
		List<String> courses = List.of();
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed when the list is empty");
	}

	@Test
	public void testPrintCoursesWithNoSpringCourses() {
		List<String> courses = List.of("Java", "Python", "C++");
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed if no courses contain 'Spring'");
	}

	@Test
	public void testPrintCoursesWithSingleSpringCourse() {
		List<String> courses = List.of("Spring Boot", "Java");
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("Spring Boot", actualOutput, "Only the course containing 'Spring' should be printed");
	}

	@Test
	public void testPrintCoursesWithMultipleSpringCourses() {
		List<String> courses = Arrays.asList("Spring Security", "Python", "Spring Framework");
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"Spring Security\nSpring Framework", actualOutput, "All courses containing 'Spring' should be printed");
	}

	@Test
	public void testPrintCoursesWithNullList() {
		List<String> courses = null;
		assertThrows(NullPointerException.class, () -> new Exercise().printCoursesContainingTheWordSpring(courses),
					 "Null pointer exception should be thrown when the list is null"
		);
	}

}
