import java.util.Scanner;

public class SumOfNNaturalNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// to get input integer		
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		int sum = 0;
		int initial;
		// iterate element to calculate sum with for loop 
		for(initial = 1; initial <= number ; initial ++)
		{
			sum = sum + initial;
		}
		System.out.println("Sum of " +number+ " is : "+sum );		
	}
}