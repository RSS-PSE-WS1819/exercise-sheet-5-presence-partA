package de.unistuttgart.iste.rss.oo.hamstersimulator;

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
public class PaulesNewFriendGame extends HamsterGame {

	PaulesNewFriendGame() throws IOException {
		super("territories/territory-ub5-small.ter");
	}

	/*
	 * Helfe Paule um zu Paula zu kommen. Als kleines Geschenk für Paula soll Paule
	 * alle Körner auf dem Territorium aufsammeln und diese zu Paula bringen.
	 * 
	 * Ablauf: 1.) Stellen Sie einen neuen Hamster Paula in der diagonal
	 * gegenüberliegenden Ecke von Paule. 2.) Lassen Sie Paule alle Körner
	 * aufsammeln 3.) Lassen Sie Paule alle Körner auf dem Feld von Paula ablegen
	 * 4.) Lassen Sie Paula alle Körner aufsammeln.
	 */
	@Override
	void run() {
	}

	// ignore
	public static void main(String[] args) {
		try {
			(new PaulesNewFriendGame()).testPaulesSkills();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
