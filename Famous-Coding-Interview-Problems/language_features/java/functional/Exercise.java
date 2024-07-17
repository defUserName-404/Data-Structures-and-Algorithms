package language_features.java.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

	/**
	 * This method filters and prints the odd numbers from the given list of integers.
	 *
	 * @param numbers The list of integers from which odd numbers will be filtered and printed.
	 */
	public void printOddNumbers(List<Integer> numbers) {
		numbers.stream()
			   .filter(number -> number % 2 != 0)
			   .forEach(System.out::println);
	}

	/**
	 * This method prints the name of the courses individually.
	 *
	 * @param courses The list of the name of courses from which will be printed.
	 */
	public void printCourses(List<String> courses) {
		courses.forEach(System.out::println);
	}

	/**
	 * This method prints the only name of the courses that contains the string "Spring".
	 *
	 * @param courses The list of the name of courses from which strings containing "Spring" will be filtered and printed.
	 */
	public void printCoursesContainingTheWordSpring(List<String> courses) {
		courses.stream()
			   .filter(course -> course.contains("Spring"))
			   .forEach(System.out::println);
	}

	/**
	 * This method prints the only name of the courses that contains at least 4 letters in its name.
	 *
	 * @param courses The list of the name of courses from which strings containing at least 4 letters will be filtered and printed.
	 */
	public void printCoursesWhoseNameHasAtleastFourLetters(List<String> courses) {
		courses.stream()
			   .filter(course -> course.chars()
									   .filter(Character::isLetter)
									   .count() >= 4)
			   .forEach(System.out::println);
	}

	/**
	 * This method calculates and prints the cubes of the odd numbers from the given list of integers.
	 *
	 * @param numbers The list of integers from which odd numbers will be filtered and their cubes will be calculated and printed.
	 */
	public void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
			   .filter(number -> number % 2 != 0)
			   .map(number -> (int) Math.pow(number, 3))
			   .forEach(System.out::println);
	}

	/**
	 * This method prints the number of characters in each course name from the given list of course names.
	 *
	 * @param courses The list of course names from which the number of characters in each name will be calculated and printed.
	 */
	public void printNumberOfCharactersInEachCourseName(List<String> courses) {
		courses.stream()
			   .map(String::length)
			   .forEach(System.out::println);
	}

	/**
	 * This method calculates and returns the sum of the squares of all the integers in the given list of integers.
	 *
	 * @param numbers The list of integers from which the squares of each integer will be calculated and summed up.
	 * @return The sum of the squares of all the integers in the given list of integers.
	 */
	public int sumOfSquaresOfNumbers(List<Integer> numbers) {
		return numbers.stream()
					  .mapToInt(number -> number * number)
					  .sum();
	}

	/**
	 * This method calculates and returns the sum of the odd numbers in the given list of integers.
	 *
	 * @param numbers The list of integers from which the odd numbers will be filtered and their sum will be calculated.
	 * @return The sum of the odd numbers in the given list of integers.
	 */
	public int sumOfOddNumbers(List<Integer> numbers) {
		return numbers.stream()
					  .filter(number -> number % 2 != 0)
					  .reduce(0, Integer::sum);
	}

	/**
	 * This method filters the even numbers from the given list of integers and returns a new list containing only the even numbers.
	 *
	 * @param numbers The list of integers from which even numbers will be filtered and returned.
	 * @return A new list containing only the even numbers from the given list of integers.
	 */
	public List<Integer> listOfEvenNumbers(List<Integer> numbers) {
		return numbers.stream()
					  .filter(number -> number % 2 == 0)
					  .collect(Collectors.toList());
	}

}
