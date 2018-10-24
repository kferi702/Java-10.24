import java.util.Scanner;

public class Feladat8_5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Kérek egy mondatot: ");
		String mondat= sc.nextLine();
		for (int i = 0; i < mondat.length(); i++) {
			
			if (mondat.charAt(i)=='a'||
					mondat.charAt(i)=='á'||
					mondat.charAt(i)=='e'||
					mondat.charAt(i)=='é'||
					mondat.charAt(i)=='i'||
					mondat.charAt(i)=='í'||
					mondat.charAt(i)=='o'||
					mondat.charAt(i)=='ó'||
					mondat.charAt(i)=='ö'||
					mondat.charAt(i)=='ő'||
					mondat.charAt(i)=='u'||
					mondat.charAt(i)=='ú') {
				
			}
		}

	}

}
