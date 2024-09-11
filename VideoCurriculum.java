package week03;

public class VideoCurriculum {
	public static void  main(String[] args) {
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Bill Turner";
		String studnetName3 = "Jack Smith";
		
		System.out.println(studentName1);
		
		String[] students = new String [3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("Enhanced for loop:");
		
		for (String student : students) {
			System.out.println(student);
		}
		
}
	
	}