package workExampes;
import java.util.Scanner;

public class strLen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduceti un string: ");
		String text=in.nextLine();
		
		System.out.println(text.length());
	}

}
