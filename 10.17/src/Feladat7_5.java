import java.util.Scanner;

public class Feladat7_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kérem a kör sugarát: ");
		int r = sc.nextInt();

		System.out.println("A kerülete: " + (int) ((2 * r) * Math.PI) + " cm");
		System.out.println("A területe: " + (int) (Math.pow(r, 2) * Math.PI) + " cm2");
	}
}
