import java.util.Scanner;

public class Feladat7_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Szám1: ");
		int sz1 = sc.nextInt();
		System.out.print("Szám2: ");
		int sz2 = sc.nextInt();
		System.out.print("Szám3: ");
		int sz3 = sc.nextInt();

		System.out.println("A három szám a: " + sz1 + ", " + sz2 + ", " + sz3);
		System.out.println("Ezekből a legnagyobb szám a: " + Math.max(sz1, (Math.max(sz2, sz3))));
	}
}