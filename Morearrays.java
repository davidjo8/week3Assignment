package week03;

public class Morearrays {
	public static void main(String[] args) {
		
		
		String [] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapple";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int[] multiplesof3 = new int[10];
		
		for (int i = 1; i <= multiplesof3.length; i++) {
			multiplesof3[i-1] = i * 3;
			System.out.println("number: " + multiplesof3[i-1]);
		}
		
		int[] multiplesof5 = new int[10];
		
		for (int i = 0; i <multiplesof5.length; i++) {
			multiplesof5[i]  = (i + 1) * 5;
			System.out.println(multiplesof5[i]);
		}
	}
}
