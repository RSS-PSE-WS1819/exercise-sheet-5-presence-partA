
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
public class PathFinderGame extends HamsterGame {

	static String TER_PATHFINDER = "territories/pathfinder.ter";
	static String TER_PATHFINDER2 = "territories/pathfinder2.ter";
	static String TER_EMPTY = "territories/empty.ter";
	static String TER_WALLED = "territories/walled.ter";

	PathFinderGame() throws IOException {
		// Es stehen zwei weitere Territorien zur verfügung.
		// Falls Sie probleme mit dem ersten haben, testen Sie Ihren Algorithmus
		// mit den anderen beiden
		super(TER_PATHFINDER2);
	}

	/*
	 * Helfe Paule um zu Paula zu kommen. Schreiben Sie dazu einen
	 * Wegefindealgorithmus.
	 * 
	 * Erstellen Sie zunächst Paula in der diagonal gegenüberliegenden Ecke und
	 * starten Sie als nächstes Ihren Algorithmus.
	 * 
	 * Testen Sie Ihren Algorithmus auch mit anderen Territorien.
	 */
	@Override
	void run() {

	}

	// ignore
	public static void main(String[] args) {
		try {
			(new PathFinderGame()).testPaulesSkills();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
