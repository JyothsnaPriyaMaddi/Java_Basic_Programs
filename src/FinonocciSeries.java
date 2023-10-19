import java.util.Scanner;

public class FinonocciSeries {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21...
		
		int number1 = 0;
		int number2 = 1;
		int resultNumber = 0;
		System.out.println("Upto how many numbers you want fibanocci series?");
		Scanner sc = new Scanner(System.in);
		int noOfDigit = sc.nextInt();
		for(int i = 0; i <= noOfDigit; i++) {
			resultNumber = number1 + number2;
			number1 = number2;
			number2 = resultNumber;
			System.out.println(resultNumber);
		}
	}
}