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
	private String[] artists;
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
	
	public Event(String[] artists, LocalDate date, LocalTime doors,
			Money ticketPrice, int ticketsSold) {

		this.artists = artists;
		this.date = date;
		this.doors = doors;
		this.ticketPrice = ticketPrice;
		this.ticketsSold = ticketsSold;
	}
	
	/**
	 * These are the getters used for this class
	 * @return artists, date, doors, ticketPrice and ticketsSold
	 */
	
	public String[] getArtists() {
		return artists;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalTime getDoors() {
		return doors;
	}

	public Money getTicketPrice() {
		return ticketPrice;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}
	
	/* 
	 * Method for adding artist
	 */
	
	public void addArtist(String artist){
		int pos = artists.length + 1;
		artists[pos] = artist;
	}
	
	/* 
	 *  Method to determine if an event has passed
	 */
	public boolean isPast(String date, String time) {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		LocalDate parseDate = LocalDate.parse(date);
		LocalTime parseTime = LocalTime.parse(time);
		
		if (currentDate.isAfter(parseDate))
			return true;
		else if (currentTime.isAfter(parseTime))
			return true;	
		else 
			return false;
	}
	
	/*
	 *  Method to calculate total boxOfficeTakings
	 */
	
	public String boxOfficeTakings(int ticketsSold, int ticketPrice) {
		int totalBoxOfficeTakings = ticketsSold * ticketPrice;
		String finalAmount = "£" + totalBoxOfficeTakings;
		return finalAmount;
	}
}
