package solution;

import java.util.HashMap;
import java.util.Map;

public class ExampleQuestions {
	
	public boolean stringHasAllUniqueCharacters(String s) {
		Map<Character, Boolean> characterOccurrence = new HashMap<>();
		for (final char c : s.toCharArray()) {
			if (characterOccurrence.containsKey(c)) {
				return false;
			}
			characterOccurrence.put(c, true);
		}
		
		return true;
	}	
	
}
