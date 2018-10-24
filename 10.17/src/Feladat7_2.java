
public class Feladat7_2 {
	static void infinityMath() {
		double inf = Double.POSITIVE_INFINITY;
		System.out.println("Végtelen: " + inf);
		System.out.println(inf + 1);
		System.out.println(inf - 1);
		System.out.println(inf * 2);
		System.out.println(inf * -2);
		System.out.println(inf / 2);
		System.out.println(inf / -2);
		double inf2 = Double.POSITIVE_INFINITY;
		System.out.println("Két végtelen: " + (inf + inf2));
		System.out.println(inf - inf2);
		System.out.println(inf * inf2);
		System.out.println(inf / inf2);

	}

	public static void main(String[] args) {
		// 2. Feladat
		infinityMath();

	}

}
