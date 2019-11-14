
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import java.io.IOException;

/**
 * Beschreiben Sie hier die Klasse HomeworkHamster.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PaulesHeartGame extends HamsterGame {

	PaulesHeartGame() throws IOException {
		super("territories/empty.ter");
	}

	/*
	 * Schreiben Sie einen Algoritmus, der Paule ein Herz mit körnern legen lässt.
	 * 
	 * Hinweis: In diesem Territorium hat Paule bereits 10 Körner im Maul.
	 */
	@Override
	protected void run() {

	}

	// ignore
	public static void main(String[] args) {
		try {
			(new PaulesHeartGame()).testPaulesSkills();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
