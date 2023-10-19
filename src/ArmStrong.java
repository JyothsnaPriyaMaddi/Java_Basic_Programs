import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to find Arnstrong for:");
		Scanner sc = new Scanner(System.in);
		String userChoice = sc.nextLine();
		int numberFormatOfUserChoice = Integer.parseInt(userChoice);
		//finding the number of digits
		int numberOfDigits = 0;
		for(int i = 1; i <= userChoice.length(); i++) {
			numberOfDigits++;
		}
		//System.out.println("Number of digits:" +numberOfDigits);
		//finding armstrong number
		
		int finalResult = 0;
		for(int i = 0; i < numberOfDigits; i++) {
			finalResult = (int) ((Math.pow(Character.getNumericValue(userChoice.charAt(i)), numberOfDigits)) + finalResult);
		}
		//System.out.println("Final Result is:" +finalResult);
		if(numberFormatOfUserChoice == finalResult) {
			System.out.println("Arm Strong Number");
		} else {
			System.out.println("Not an Arm Strong number");
		}
	}
}
