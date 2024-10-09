package solution;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ExampleQuestionsTest {
	
	private ExampleQuestions exampleQuestions; 

	@BeforeEach
	public void setup() {
		exampleQuestions = new ExampleQuestions();
	}
	
	@org.junit.jupiter.api.Test
	void stringHasAllUniqueCharacters_TC1() {
		assertTrue(exampleQuestions.stringHasAllUniqueCharacters("abcdef"));
	}


	@org.junit.jupiter.api.Test
	void stringHasAllUniqueCharacters_TC2() {
		assertFalse(exampleQuestions.stringHasAllUniqueCharacters("abcabc"));
	}


	@org.junit.jupiter.api.Test
	void stringHasAllUniqueCharacters_TC3() {
		assertTrue(exampleQuestions.stringHasAllUniqueCharacters("abc123"));
	}


	@org.junit.jupiter.api.Test
	void stringHasAllUniqueCharacters_TC4() {
		assertFalse(exampleQuestions.stringHasAllUniqueCharacters("1231hfha"));
	}

}
