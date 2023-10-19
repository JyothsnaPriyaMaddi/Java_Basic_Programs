import java.util.Scanner;

public class Factorial {

	/* 4! = 4*3*2*1
	 * 5! = 5*4*3*2*1
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number you want to know the factorial for:");
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt(); //4
		int result = 1;
		for(int i = (userChoice-1); i > 0; i--) {
			//4 = 4 * 3
			result = userChoice * i;
			userChoice = result;
		}
		System.out.println(result);
	}
}
