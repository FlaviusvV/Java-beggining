package workExampes;
import java.util.Scanner; 


public class triangleAria {

	public static void main(String[] args) {
		
		int baza;
		int inaltimea;
		int aria=0;
		System.out.println("cat are baza: ");
		Scanner in  = new Scanner(System.in);  
		baza=in.nextInt();
		
		System.out.println("inaltimea este: ");
		inaltimea=in.nextInt();
		
		aria=(baza * inaltimea)/2;
		System.out.println("aria este: "+aria);

	}

}
