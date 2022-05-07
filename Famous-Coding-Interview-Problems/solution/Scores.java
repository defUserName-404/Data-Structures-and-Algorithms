package solution;

import java.util.Arrays;

/**
 * ? We need a class to store high scores in a game.
 * We need to display highest 10 scores by the player
 */
public class Scores {
	private final GameEntry[] gameEntries, highestScores;

	public Scores() {
		gameEntries = new GameEntry[11];
		highestScores = new GameEntry[10];

		Arrays.fill(gameEntries, new GameEntry("", 0));
	}

	public void add(GameEntry gameEntry) {
		gameEntries[10] = gameEntry;

		sort();
	}

	public GameEntry[] getHighestScores() {
		System.arraycopy(gameEntries, 0, highestScores, 0, 10);

		return highestScores;
	}

	private void sort() {
		Arrays.sort(gameEntries, (entry1, entry2) -> {
			if (entry1.score() != entry2.score())
				return entry2.score() - entry1.score();

			return 0;
		});
	}
}

