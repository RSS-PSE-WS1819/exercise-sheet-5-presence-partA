import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import java.io.IOException;

import java.io.File;
import java.io.*;

/**
 * Beschreiben Sie hier die Klasse MyFirstSimpleHamster.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HamsterGame extends SimpleHamsterGame {
	Territory territory;

	HamsterGame(String territoryPath) throws IOException {
		File terFile = new File(territoryPath);
		try (InputStream targetStream = new FileInputStream(terFile);) {
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}

		game.displayInNewGameWindow();
		territory = game.getTerritory();
	}

	void testPaulesSkills() {
		try {
			this.run();
		} catch (final RuntimeException e) {
			this.game.getInputInterface().showAlert(e);
		}
		game.stopGame();
	}

}
