package week03;

public class MoreMethods {
	
	public static void main(String[] args) {
		
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println(sumArray(myArray));
		
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.7;
		grades[2] = 67.7;
		grades[3] = 100;
		grades[4] = 78.7;
				
		System.out.println(calculateAverage(grades));
		
		System.out.println(multiplyString("Hello", 3));
	}
	
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static double calculateAverage(double[] numbers) {
		double sum =0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}

}
