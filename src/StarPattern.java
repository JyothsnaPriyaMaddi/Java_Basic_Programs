import java.util.Scanner;

public class StarPattern {
/*
	*
	* *
	* * *
	* * * *
	* * * * * 
	*/
	
	public static void main(String[] args) {
		System.out.println("Enter the number of lines you want the star pattern:");
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		for(int i = 0; i < userChoice; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
