import java.util.Scanner;

public class Feladat8_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Kérek egy szót: ");
		String s= sc.nextLine();
		StringBuffer sb= new StringBuffer(s);
		String res= sb.reverse().toString();
		if (s.equals(res)) {
			System.out.println("Palindróm szó");
		}
		else {
			System.out.println("NEM palindróm!");
		}
	}

}
