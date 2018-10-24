import java.util.Scanner;

public class Feladat8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kérek egy mondatot (ha lehet szerepeljen benne a kutya szó is :):");
		String mondat = sc.nextLine();
		System.out.println(mondat);
		String kutya = "kutya";
		int lastIndex = 0;
		int count = 0;

		while((lastIndex = mondat.indexOf(kutya, lastIndex)) != -1) {
		     count++;
		     lastIndex += kutya.length() - 1;
		}
		System.out.println(count);

	}
}
