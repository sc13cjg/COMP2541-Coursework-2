package comp2541.coursework.cwk2;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;

/**
 * <p>
 * Event.java will be contain the main methods for the actions performed
 * by Event, such as creating an event (artist performed). Contains getters, constructors and methods.
 * </p>
 * 
 * @author Christian J. Gibbs
 * COMP2451 Coursework 2
 * Repository: <a>https://github.com/sc13cjg/COMP2541-Coursework-2</a>
 */
public class Event
{
	private String artists;
	private String date;
	private String doors;
	private int ticketPrice;
	private int ticketsSold;
	
	/*
	 * Reference capacity from Venue
	 */
	
	public Venue capacity;
	
	/**
	 * This is the main constructor for this Event class
	 * @param artists
	 * @param date
	 * @param doors
	 * @param ticketPrice
	 * @param ticketsSold
	 */
	
	public Event(String artists, String date, String doors,
			int ticketPrice, int ticketsSold){
		
		this.artists = artists;
		this.date = date;
		this.doors = doors;
		this.ticketPrice = ticketPrice;
		this.ticketsSold = ticketsSold;
		
		
		// Validate artist if empty
		if (artists == null || artists.equals("")){
			throw new IllegalArgumentException("Artist cannot be left blank!");
		}
		
		// Validate date
		if (date.length() != "yyyy-MM-dd".length()){
			throw new IllegalArgumentException("Date cannot be left blank!");
		}
		
		// Validate doors open time
		if (doors.length() != "hh:mm".length()){
			throw new IllegalArgumentException("Doors opening time cannot be left blank!");
		}
		
		// Validate ticket price
		if (ticketPrice <= 0){
			throw new IllegalArgumentException("Ticket Price cannot be free or less than free!");
		}
		
		// Validate amount of tickets sold
		if (ticketsSold < 0){
			throw new IllegalArgumentException("You cannot sell less than no tickets!");
		}
		
	}
	
	/**
	 * These are the getters used for this class
	 * @return artists, date, doors, ticketPrice and ticketsSold
	 */
	
	public String getArtists() {
		return artists;
	}

	public String getDate() {
		return date;
	}

	public String getDoors() {
		return doors;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}	
	
	/* 
	 * Method for adding artist
	 * @param artist
	 */
	
	public void addArtist(String artist){
		this.artists = this.artists + "," + artists;
	}
	
	/* 
	 *  Method to determine if an event has passed
	 *  @param date
	 *  @param time
	 */
	
	public boolean isPast(String date, String time) {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		org.joda.time.format.DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy");
		LocalDate dt = dtf.parseLocalDate(date);
		
		org.joda.time.format.DateTimeFormatter tf = DateTimeFormat.forPattern("HH:mm");
		LocalTime t = tf.parseLocalTime(time);
	
		/*LocalDate parseDate = LocalDate.parse(date);
		LocalTime parseTime = LocalTime.parse(time);*/
		
		if (currentDate.isAfter(dt))
			return true;
		else if (currentTime.isAfter(t))
			return true;	
		else 
			return false;
	}
	
	/*
	 * Method to determine if an event is upcoming
	 * @param date
	 * @param time
	 */
	
	public boolean isUpcoming(String date, String time) {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		org.joda.time.format.DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy");
		LocalDate dt = dtf.parseLocalDate(date);
		
		org.joda.time.format.DateTimeFormatter tf = DateTimeFormat.forPattern("HH:mm");
		LocalTime t = tf.parseLocalTime(time);
		
		if (currentDate.isBefore(dt))
			return true;
		else if (currentTime.isBefore(t))
			return true;
		else 
			return false;
	}
	
	/*
	 *  Method to determine if an event is sold out
	 *  @param capacity
	 *  @param ticketsSold
	 */
	
	public boolean isSoldOut(int capacity, int ticketsSold) {
		if (capacity >= ticketsSold)
			return true;
		else 
			return false;
	}
	
	/*
	 *  Method to display how many tickets are available
	 *  @param capacity
	 *  @param ticketsSold
	 */
	
	public int ticketsAvailable(int capacity, int ticketsSold) {
		int availableTickets = capacity - ticketsSold;
		return availableTickets;
	}
	
	/*
	 *  Method for sell a ticket for an event
	 *  @param ticketsSold
	 *  @param capacity
	 */
	
	public boolean sellTickets (int ticketsRequired, int ticketsSold, int capacity){
		int availableTickets = capacity - ticketsSold;
		if (ticketsRequired <= availableTickets)
			return true;
		else
			return false;
	}
	
	/*
	 *  Method to calculate total boxOfficeTakings
	 *  @param ticketsSold
	 *  @param ticketPrice
	 */
	
	public String boxOfficeTakings(int ticketsSold, int ticketPrice) {
		int totalBoxOfficeTakings = ticketsSold * ticketPrice;
		String finalAmount = "£" + totalBoxOfficeTakings;
		return finalAmount;
	}
}
