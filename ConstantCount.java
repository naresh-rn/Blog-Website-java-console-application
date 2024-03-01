import java.util.Scanner;
public class ConstantCount{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String sentence = scanner.nextLine().toLowerCase();
		scanner.close();
		
		int constantCount = 0;
		for(int initial = 0; initial < sentence.length(); initial ++){
			char ch = sentence.charAt(initial);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =	= 'u' ){
				continue;
			}
			else{
				constantCount ++;
			}
		}
		System.out.println("Constant element count is: " + constantCount );
	}
}