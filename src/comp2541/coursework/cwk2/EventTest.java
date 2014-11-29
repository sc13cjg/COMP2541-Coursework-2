package comp2541.coursework.cwk2;

import org.junit.Test;

public class EventTest
{
	// Generate Pass
	Venue O2 = new Venue("O2", "Leeds", "01132241981" , "www.o2.com", 20000 );
	
	// Generate Fail - test validation
	Venue O2Fail = new Venue(" "," "," "," ", -12);
	
	// Generate Pass
	Venue Arena = new Venue("Leeds Arena", "Leeds", "01132263840" , "www.leeds-arena.com", 65000 );
	
	// Generate Fail - test validation
	Venue ArenaFail = new Venue(" "," "," "," ", -9001);
	
	// Generate Pass
	Event Bach = new Event("Bach", "22.12.2014", "19:00", 499, 64943);
	
	// Generate Pass
	Event FleetwoodMac = new Event("Fleetwood Mac", "04.01.2015", "20:00", 99, 19997 );
	
	@Test public void Event() {
		Bach.addArtist("Chopin"); // Generate Pass
		Bach.isPast("22.12.2014","16:45"); // Generate Pass
		Bach.isUpcoming("24.06.2015", "12:00"); // Generate Pass
		Bach.isSoldOut(20000, 18516); // Generate Pass
		Bach.ticketsAvailable(20000, 2143); // Generate Pass
		Bach.sellTickets(7, 19513, 20000); // Generate Pass
		
		FleetwoodMac.addArtist("Jim Morrison"); // Generate Pass
		FleetwoodMac.isPast("29.11.2014", "19:00"); // Generate Pass
		FleetwoodMac.isUpcoming("26.12.2014", "22:31"); // Generate Pass
		FleetwoodMac.isSoldOut(100000, 96000); // Generate Pass
		FleetwoodMac.ticketsAvailable(17500, 16741); // Generate Pass
		FleetwoodMac.sellTickets(2, 65041, 70000); // Generate Pass
	}
	
	
	
}



