package workExampes;

public class ex1test {

	public static void main(String[] args) {
		int i=0;
		eticheta:
		while (i < 10) {
		System.out.println("i="+i);
		int j=0;
		while (j < 10) {
		j++;
		if (j==5) continue eticheta;
		if (j==7) break eticheta;
		System.out.println("j="+j);
		}
		i++;
		}


	}

}
