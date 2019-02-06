package workExampes;
import java.util.Scanner;

public class posOrNeg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti un numar");
		int n = in.nextInt();
		
		if(n>0) {
			System.out.println("numarul e pozitiv" );
		}
		else {
			System.out.println("numarul  e negativ" );
		}
	}

}
