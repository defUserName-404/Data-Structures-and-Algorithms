package language_features.java.functional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseProblem2Test {

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
		new Exercise().printCourses(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertTrue(actualOutput.isEmpty(), "No output should be printed when the list is empty");
	}

	@Test
	public void testPrintCoursesWithSingleCourse() {
		List<String> courses = List.of("Java");
		new Exercise().printCourses(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		String expectedOutput = "Java";
		assertEquals(expectedOutput, actualOutput, "Only one item should be printed when the list has only one item");
	}

	@Test
	public void testPrintCoursesWithMultipleCourses() {
		List<String> courses = Arrays.asList("Java", "Python", "C++");
		new Exercise().printCourses(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		String expectedOutput = "Java\nPython\nC++";
		assertEquals(expectedOutput, actualOutput, "All the items in the list should be printed");
	}

	@Test
	public void testPrintCoursesWithNullList() {
		List<String> courses = null;
		assertThrows(
				NullPointerException.class, () -> new Exercise().printCourses(courses),
				"Null pointer exception should be thrown when the list is null"
		);
	}

}
