import java.util.Scanner;

public class AbstractionDemoForObject {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();		
		int number = scanner.nextInt();
		
		System.out.println("Information read from scanner");
		System.out.println(input);
		System.out.println(number);
		
	}
}
