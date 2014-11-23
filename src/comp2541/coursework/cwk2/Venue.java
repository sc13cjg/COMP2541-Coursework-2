package comp2541.coursework.cwk2;

/**
 * 
 * @author Christian J. Gibbs
 *
 */
public class Venue{
    private String name;
    private String address;
    private Double phoneNumber;
    private String website;
    private int capacity;
    
	/**
	 * This is the main constructor for this Venue class
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param website
	 * @param capacity
	 */
    
	public Venue(String name, String address, Double phoneNumber,
			String website, int capacity) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.website = website;
		this.capacity = capacity;
	}

	/**
	 * These are the getters used for this class
	 * @return name, address, phoneNumber, website and capacity
	 */
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Double getPhoneNumber() {
		return phoneNumber;
	}

	public String getWebsite() {
		return website;
	}

	public int getCapacity() {
		return capacity;
	}
}