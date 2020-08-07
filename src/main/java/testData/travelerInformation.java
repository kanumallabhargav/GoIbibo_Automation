package testData;

public class travelerInformation 
{
	public static String getTravelerFirstName()
	{
		String firstName = System.getProperty("travelerFirstName");
		return firstName;
	}
	public static String getTravelerLastName()
	{
		String lastName = System.getProperty("travelerLastName");
		return lastName;
	}
	public static String getTravelerEmail()
	{
		String email = System.getProperty("travelerEmail");
		return email;
	}
	public static String getTravelerPhone()
	{
		String phone = System.getProperty("travelerPhone");
		return phone;
	}
}