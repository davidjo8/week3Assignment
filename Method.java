package week03;

public class Method {
	public static void main (String[] args) {
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName , lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
	}
	
	public static String createFullName(String ha, String be) {
		return ha + " " + be;
	}
}
