package language_features.java.functional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseProblem1Test {

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

}
