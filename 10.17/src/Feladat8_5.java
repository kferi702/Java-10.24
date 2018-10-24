import java.util.Scanner;

public class Feladat8_5 {

	private static String replaceCharWithUpperCase(char c, String mondat)
	{
	    return mondat.replace(c, Character.toUpperCase(c));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Kérek egy mondatot: ");
		String mondat= sc.nextLine();
		
		mondat = replaceCharWithUpperCase('a', mondat.toLowerCase());
		//egybe kéne rakni a többi betüt is
		System.out.println(mondat);
	}

}
