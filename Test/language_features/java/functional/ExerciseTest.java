package language_features.java.functional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTest {

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
	public void testPrintOddNumbersWithEmptyList() {
		List<Integer> emptyList = List.of();
		new Exercise().printOddNumbers(emptyList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertTrue(actualOutput
						   .isEmpty(), "No output should be printed when the input list is empty");
	}

	@Test
	public void testPrintOddNumbersWithOddNumbersList() {
		List<Integer> oddNumbersList = Arrays.asList(1, 3, 5, 7);
		new Exercise().printOddNumbers(oddNumbersList);
		String expectedOutput = "1\n3\n5\n7";
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(expectedOutput, actualOutput,
					 "Should print only odd numbers when the input list contains only odd numbers"
		);
	}

	@Test
	public void testPrintOddNumbersWithMixedNumbersList() {
		List<Integer> mixedNumbersList = Arrays.asList(1, 2, 3, 4, 5, 6);
		new Exercise().printOddNumbers(mixedNumbersList);
		String expectedOutput = "1\n3\n5";
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(expectedOutput, actualOutput,
					 "Should print only odd numbers when the input list contains both odd and even numbers"
		);
	}

	@Test
	public void testPrintOddNumbersWithSingleOddNumberList() {
		List<Integer> singleOddNumberList = List.of(1);
		new Exercise().printOddNumbers(singleOddNumberList);
		String expectedOutput = "1";
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(expectedOutput, actualOutput,
					 "Should print only the first odd number when the input list contains only one odd number"
		);
	}

	@Test
	public void testPrintOddNumbersWithEvenNumbersList() {
		List<Integer> evenNumbersList = Arrays.asList(2, 4, 6);
		new Exercise().printOddNumbers(evenNumbersList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertTrue(actualOutput
						   .isEmpty(), "Should print no numbers when the input list contains only even numbers");
	}

	@Test
	public void testPrintOddNumbersWithZeroList() {
		List<Integer> zeroList = Arrays.asList(0, 0, 0);
		new Exercise().printOddNumbers(zeroList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertTrue(actualOutput
						   .isEmpty(), "No output should be printed when the input list contains only zero");
	}

	@Test
	public void testPrintOddNumbersWithMultipleOddNumbersList() {
		List<Integer> oddNumbersList = Arrays.asList(1, 3, 5, 7);
		new Exercise().printOddNumbers(oddNumbersList);
		String expectedOutput = "1\n3\n5\n7";
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(expectedOutput, actualOutput,
					 "Should print all odd numbers when the input list contains multiple odd numbers"
		);
	}

	@Test
	public void testPrintOddNumbersWithNegativeOddNumberList() {
		List<Integer> negativeOddNumbersList = Arrays.asList(-1, -3, -5);
		new Exercise().printOddNumbers(negativeOddNumbersList);
		String expectedOutput = "-1\n-3\n-5";
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(expectedOutput, actualOutput,
					 "Should print no numbers when the input list contains a negative odd number"
		);
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

	@Test
	public void testPrintCoursesWhichContainsWordSpringWithEmptyList() {
		List<String> courses = List.of();
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed when the list is empty");
	}

	@Test
	public void testPrintCoursesWhichContainsWordSpringWithNoSpringCourses() {
		List<String> courses = List.of("Java", "Python", "C++");
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed if no courses contain 'Spring'");
	}

	@Test
	public void testPrintCoursesWhichContainWordSpringWithSingleSpringCourse() {
		List<String> courses = List.of("Spring Boot", "Java");
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("Spring Boot", actualOutput, "Only the course containing 'Spring' should be printed");
	}

	@Test
	public void testPrintCoursesWhichContainWordSpringWithMultipleSpringCourses() {
		List<String> courses = Arrays.asList("Spring Security", "Python", "Spring Framework");
		new Exercise().printCoursesContainingTheWordSpring(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"Spring Security\nSpring Framework", actualOutput, "All courses containing 'Spring' should be printed");
	}

	@Test
	public void testPrintCoursesWhichContainWordSpringWithNullList() {
		List<String> courses = null;
		assertThrows(NullPointerException.class, () -> new Exercise().printCoursesContainingTheWordSpring(courses),
					 "Null pointer exception should be thrown when the list is null"
		);
	}

	@Test
	public void testPrintCoursesContainingFourLettersWithEmptyList() {
		List<String> courses = List.of();
		new Exercise().printCoursesWhoseNameHasAtleastFourLetters(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed when the list is empty");
	}

	@Test
	public void testPrintCoursesContainingFourLettersWithAllShortCourses() {
		List<String> courses = List.of("Jav", "C", "Py");
		new Exercise().printCoursesWhoseNameHasAtleastFourLetters(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed if all courses are less than 4 characters");
	}

	@Test
	public void testPrintCoursesContainingFourLettersWithSingleCourseWithAtLeastFourEnglishLetters() {
		List<String> courses = List.of("Java123");
		new Exercise().printCoursesWhoseNameHasAtleastFourLetters(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("Java123", actualOutput, "Course with at least 4 English letters should be printed");
	}

	@Test
	public void testPrintCoursesContainingFourLettersWithMultipleCoursesWithAtLeastFourEnglishLetters() {
		List<String> courses = List.of("Java101", "Pyt3", "Spring Framework");
		new Exercise().printCoursesWhoseNameHasAtleastFourLetters(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"Java101\nSpring Framework", actualOutput, "Courses with at least 4 English letters should be printed");
	}

	@Test
	public void testPrintCoursesContainingFourLettersContainingFourLettersWithNullList() {
		List<String> courses = null;
		assertThrows(
				NullPointerException.class,
				() -> new Exercise().printCoursesWhoseNameHasAtleastFourLetters(courses),
				"Null pointer exception should be thrown when the list is null"
		);
	}

}
