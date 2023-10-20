import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter string or number you want to reverse:");
		Scanner sc = new Scanner(System.in);
		String userChoice = sc.nextLine();
		String reverse = new String();
		
		for(int i = userChoice.length()-1; i >= 0; i--) {
			reverse = reverse + userChoice.charAt(i);
		}
		System.out.println(reverse);
		
	}
}
