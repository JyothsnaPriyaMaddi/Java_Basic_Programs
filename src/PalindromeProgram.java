import java.util.Scanner;

public class PalindromeProgram {
	public static void main(String[] args) {
		System.out.println("Enter the string you want to check:");
		Scanner sc = new Scanner(System.in);
		String userChoice = sc.nextLine();
		String reverse = "";
		for(int i = userChoice.length()-1; i >= 0; i--) {
			reverse = reverse + userChoice.charAt(i);
		}
		if(userChoice.equalsIgnoreCase(reverse)) {
			System.out.println("Yes, it is palindrome");
		} else {
			System.out.println("No, it is not");
		}
	}
}