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
		assertTrue(actualOutput.isEmpty(), "No output should be printed when the input list is empty");
	}

	@Test
	public void testPrintOddNumbersWithOddNumbersList() {
		List<Integer> oddNumbersList = Arrays.asList(1, 3, 5, 7);
		new Exercise().printOddNumbers(oddNumbersList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"1\n3\n5\n7", actualOutput,
				"Should print only odd numbers when the input list contains only odd numbers"
		);
	}

	@Test
	public void testPrintOddNumbersWithMixedNumbersList() {
		List<Integer> mixedNumbersList = Arrays.asList(1, 2, 3, 4, 5, 6);
		new Exercise().printOddNumbers(mixedNumbersList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"1\n3\n5", actualOutput,
				"Should print only odd numbers when the input list contains both odd and even numbers"
		);
	}

	@Test
	public void testPrintOddNumbersWithSingleOddNumberList() {
		List<Integer> singleOddNumberList = List.of(1);
		new Exercise().printOddNumbers(singleOddNumberList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"1", actualOutput,
				"Should print only the first odd number when the input list contains only one odd number"
		);
	}

	@Test
	public void testPrintOddNumbersWithEvenNumbersList() {
		List<Integer> evenNumbersList = Arrays.asList(2, 4, 6);
		new Exercise().printOddNumbers(evenNumbersList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertTrue(actualOutput.isEmpty(), "Should print no numbers when the input list contains only even numbers");
	}

	@Test
	public void testPrintOddNumbersWithZeroList() {
		List<Integer> zeroList = Arrays.asList(0, 0, 0);
		new Exercise().printOddNumbers(zeroList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertTrue(actualOutput.isEmpty(), "No output should be printed when the input list contains only zero");
	}

	@Test
	public void testPrintOddNumbersWithMultipleOddNumbersList() {
		List<Integer> oddNumbersList = Arrays.asList(1, 3, 5, 7);
		new Exercise().printOddNumbers(oddNumbersList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"1\n3\n5\n7", actualOutput,
				"Should print all odd numbers when the input list contains multiple odd numbers"
		);
	}

	@Test
	public void testPrintOddNumbersWithNegativeOddNumberList() {
		List<Integer> negativeOddNumbersList = Arrays.asList(-1, -3, -5);
		new Exercise().printOddNumbers(negativeOddNumbersList);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals(
				"-1\n-3\n-5", actualOutput,
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
		assertEquals("Java", actualOutput, "Only one item should be printed when the list has only one item");
	}

	@Test
	public void testPrintCoursesWithMultipleCourses() {
		List<String> courses = Arrays.asList("Java", "Python", "C++");
		new Exercise().printCourses(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("Java\nPython\nC++", actualOutput, "All the items in the list should be printed");
	}

	@Test
	public void testPrintCoursesWithNullList() {
		List<String> courses = null;
		assertThrows(NullPointerException.class, () -> new Exercise().printCourses(courses),
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

	@Test
	public void testPrintCubesOfOddNumbersWithEmptyList() {
		List<Integer> numbers = List.of();
		new Exercise().printCubesOfOddNumbers(numbers);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed when the list is empty");
	}

	@Test
	public void testPrintCubesOfOddNumbersWithAllEvenNumbers() {
		List<Integer> numbers = List.of(2, 4, 6);
		new Exercise().printCubesOfOddNumbers(numbers);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed if all numbers are even");
	}

	@Test
	public void testPrintCubesOfOddNumbersWithSingleOddNumber() {
		List<Integer> numbers = List.of(1, 2, 4);
		new Exercise().printCubesOfOddNumbers(numbers);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("1", actualOutput, "Only the cube of the odd number should be printed");
	}

	@Test
	public void testPrintCubesOfOddNumbersWithMultipleOddNumbers() {
		List<Integer> numbers = List.of(5, 2, 7, 4);
		new Exercise().printCubesOfOddNumbers(numbers);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("125\n343", actualOutput, "Cubes of all odd numbers should be printed");
	}

	@Test
	public void testPrintCubesOfOddNumbersWithNullList() {
		List<Integer> numbers = null;
		assertThrows(NullPointerException.class, () -> new Exercise().printCubesOfOddNumbers(numbers),
					 "Null pointer exception should be thrown when the list is null"
		);
	}

	@Test
	public void testPrintNumberOfCharactersWithEmptyList() {
		List<String> courses = List.of();
		new Exercise().printNumberOfCharactersInEachCourseName(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("", actualOutput, "No output should be printed when the list is empty");
	}

	@Test
	public void testPrintNumberOfCharactersWithSingleCourse() {
		List<String> courses = List.of("Java");
		new Exercise().printNumberOfCharactersInEachCourseName(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("4", actualOutput, "Length of the single course name should be printed");
	}

	@Test
	public void testPrintNumberOfCharactersWithMultipleCourses() {
		List<String> courses = Arrays.asList("Python", "Spring Framework", "C++");
		new Exercise().printNumberOfCharactersInEachCourseName(courses);
		String actualOutput = outputStreamCaptor.toString()
												.trim();
		assertEquals("6\n16\n3", actualOutput, "Length of each course name should be printed on a new line");
	}

	@Test
	public void testPrintNumberOfCharactersWithNullList() {
		List<String> courses = null;
		assertThrows(NullPointerException.class, () -> new Exercise().printNumberOfCharactersInEachCourseName(courses),
					 "Null pointer exception should be thrown when the list is null"
		);
	}

	@Test
	public void testSumOfSquaresWithEmptyList() {
		List<Integer> numbers = List.of();
		int actualSum = new Exercise().sumOfSquaresOfNumbers(numbers);
		assertEquals(0, actualSum, "Sum should be 0 for an empty list");
	}

	@Test
	public void testSumOfSquaresWithSingleNumber() {
		List<Integer> numbers = List.of(5);
		int actualSum = new Exercise().sumOfSquaresOfNumbers(numbers);
		assertEquals(25, actualSum, "Sum should be the square of the single number");
	}

	@Test
	public void testSumOfSquaresWithMultipleNumbers() {
		List<Integer> numbers = List.of(2, 3, 4);
		int actualSum = new Exercise().sumOfSquaresOfNumbers(numbers);
		assertEquals(29, actualSum, "Sum should be the sum of squares of all numbers");
	}

	@Test
	public void testSumOfSquaresWithNegativeNumbers() {
		List<Integer> numbers = List.of(-2, 1, 0);
		int actualSum = new Exercise().sumOfSquaresOfNumbers(numbers);
		assertEquals(5, actualSum, "Sum should be the sum of squares including negative numbers");
	}

	@Test
	public void testSumOfSquaresWithNullList() {
		List<Integer> numbers = null;
		assertThrows(NullPointerException.class, () -> new Exercise().sumOfSquaresOfNumbers(numbers),
					 "Null pointer exception should be thrown when the list is null"
		);
	}

	@Test
	public void testSumOfOddNumbersWithEmptyList() {
		List<Integer> numbers = List.of();
		int actualSum = new Exercise().sumOfOddNumbers(numbers);
		assertEquals(0, actualSum, "Sum should be 0 for an empty list");
	}

	@Test
	public void testSumOfOddNumbersWithAllEvenNumbers() {
		List<Integer> numbers = List.of(2, 4, 6);
		int actualSum = new Exercise().sumOfOddNumbers(numbers);
		assertEquals(0, actualSum, "Sum should be 0 if all numbers are even");
	}

	@Test
	public void testSumOfOddNumbersWithSingleOddNumber() {
		List<Integer> numbers = List.of(1, 2, 3);
		int actualSum = new Exercise().sumOfOddNumbers(numbers);
		assertEquals(4, actualSum, "Sum should be the single odd number");
	}

	@Test
	public void testSumOfOddNumbersWithMultipleOddNumbers() {
		List<Integer> numbers = List.of(5, 2, 7, 4);
		int actualSum = new Exercise().sumOfOddNumbers(numbers);
		assertEquals(12, actualSum, "Sum should be the sum of all odd numbers");
	}

	@Test
	public void testSumOfOddNumbersWithNegativeOddNumbers() {
		List<Integer> numbers = List.of(-3, 1, 0, -5);
		int actualSum = new Exercise().sumOfOddNumbers(numbers);
		assertEquals(-7, actualSum, "Sum should include negative odd numbers");
	}

	@Test
	public void testSumOfOddNumbersWithNullList() {
		List<Integer> numbers = null;
		assertThrows(NullPointerException.class, () -> new Exercise().sumOfOddNumbers(numbers),
					 "Null pointer exception should be thrown when the list is null"
		);
	}

}
