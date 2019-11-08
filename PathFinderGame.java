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
public class PathFinderGame extends HamsterGame{

    private static final String TER_PATHFINDER = "+libs/territories/pathfinder.ter";
    private static final String TER_PATHFINDER2 = "+libs/territories/pathfinder2.ter";
    private static final String TER_EMPTY = "+libs/territories/empty.ter";
    private static final String TER_WALLED = "+libs/territories/walled.ter";
    
    
    PathFinderGame() throws IOException {
        // Es stehen zwei weitere Territorien zur verfügung.
        // Falls Sie probleme mit dem ersten haben, testen Sie Ihren Algorithmus 
        // mit den anderen beiden 
        super(TER_PATHFINDER2);
    }
    
    /*
     * Helfe Paule um zu Paula zu kommen. 
     * Schreiben Sie dazu einen Wegefindealgorithmus. 
     * 
     * Erstellen Sie zunächst Paula in der diagonal gegenüberliegenden Ecke und
     * starten Sie als nächstes Ihren Algorithmus. 
     * 
     * Testen Sie Ihren Algorithmus auch mit anderen Territorien. 
     */
    @Override
    protected void run(){
       
    }
    
    
}
