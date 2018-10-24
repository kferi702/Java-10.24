
public class Feladat1 {
	static void intMinMax() {

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("\nInteger értékhatárai:");
		System.out.println(max + ", " + min);
	}

	static void shortMinMax() {

		short max = (short) Short.MAX_VALUE;
		short min = (short) Short.MIN_VALUE;
		System.out.println("\nShort értékhatárai:");
		System.out.println(max + ", " + min);
	}

	static void byteMinMax() {

		byte max = Byte.MAX_VALUE;
		byte min = Byte.MIN_VALUE;
		System.out.println("\nByte értékhatárai:");
		System.out.println(max + ", " + min);
	}

	static void longMinMax() {

		long max = Long.MAX_VALUE;
		long min = Long.MIN_VALUE;
		System.out.println("\nLong értékhatárai:");
		System.out.println(max + ", " + min);
	}

	static void floatMinMax() {

		float max = Float.MAX_VALUE;
		float min = Float.MIN_VALUE;
		System.out.println("\nFloat értékhatárai:");
		System.out.println(max + ", " + min);
	}

	static void doubleMinMax() {

		double max = Double.MAX_VALUE;
		double min = Double.MIN_VALUE;
		System.out.println("\nDouble értékhatárai:");
		System.out.println(max + ", " + min);
	}



	public static void main(String[] args) {
		// 1. Feladat
		byteMinMax();
		shortMinMax();
		intMinMax();
		doubleMinMax();
		longMinMax();
		floatMinMax();


	}

}
