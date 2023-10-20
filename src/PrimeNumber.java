import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// 2,3,5,7,11
		System.out.println("Enter the number you want to check whether it is Prime or not:");
		Scanner sc = new Scanner(System.in);
		
		int userChoice = sc.nextInt();
		int count = 0;
		for(int i = 2; i < userChoice; i++) {
			if(userChoice % i == 0) {
				count ++;
			}
		}
		if(count > 0) {
			System.out.println(userChoice+" is not a prime number");
		} else {
			System.out.println(userChoice+" is a prime number");
		}
	}

}
