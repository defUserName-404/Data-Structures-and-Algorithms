package language_features.java.functional;

import javax.swing.*;
import java.util.List;

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
	
}
