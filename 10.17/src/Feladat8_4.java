import java.util.Scanner;

public class Feladat8_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Kérek egy mondatot:");
		String mondat= sc.nextLine();
		mondat=mondat.replaceAll("egy", "kettő");
		System.out.println(mondat);
		

	}

}
