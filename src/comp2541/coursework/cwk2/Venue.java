package comp2541.coursework.cwk2;


/**
 * @author Christian J. Gibbs
 * COMP2451 Coursework 2
 * Repository: https://github.com/sc13cjg/COMP2541-Coursework-2
 *
 */

public class Venue{
    private String name;
    private String address;
    private String phoneNumber;
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
    
	public Venue(String name, String address, String phoneNumber,
			String website, int capacity) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.website = website;
		this.capacity = capacity;
		
		if (name == null || name.equals("")){
			throw new IllegalArgumentException("Please enter a valid name. Cannot be blank!");
		}
		
		if (address == null || address.equals("")){
			throw new IllegalArgumentException("Please enter a valid address. Cannot be blank!");
		}
		
		if (address == null || address.equals("")){
			throw new IllegalArgumentException("Phone number has to be at least 11 digits. Please check the number you are entering and try again.");
		}
		
		// Website may be optional, consider it is mandatory
		if (website == null || website.equals("")){
			throw new IllegalArgumentException("Website cannot be blank, please enter a website.");
		}
		
		if (capacity <= 0 ){
			throw new IllegalArgumentException("Capacity cannot be left empty (or negative), please check the capacity and enter a value.");
		}
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getWebsite() {
		return website;
	}

	public int getCapacity() {
		return capacity;
	}
}