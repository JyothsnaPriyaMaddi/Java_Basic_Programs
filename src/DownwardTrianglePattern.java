import java.util.Scanner;

public class DownwardTrianglePattern {
	
	public static void main(String[] args) {
		System.out.println("Enter the number of lines you want to need:");
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		for(int i = userChoice; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
