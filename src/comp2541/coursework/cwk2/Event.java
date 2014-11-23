package comp2541.coursework.cwk2;

import org.joda.money.Money;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/**
 * @author Christian J. Gibbs
 * COMP2451 Coursework 2
 *
 */

public class Event
{
	private String artists;
	private LocalDate date;
	private LocalTime doors;
	private Money ticketPrice;
	private int ticketsSold;
	
	/**
	 * This is the main constructor for this Event class
	 * @param artists
	 * @param date
	 * @param doors
	 * @param ticketPrice
	 * @param ticketsSold
	 */
	
	public Event(String artists, LocalDate date, LocalTime doors,
			Money ticketPrice, int ticketsSold) {
		super();
		this.artists = artists;
		this.date = date;
		this.doors = doors;
		this.ticketPrice = ticketPrice;
		this.ticketsSold = ticketsSold;
	}	
}
