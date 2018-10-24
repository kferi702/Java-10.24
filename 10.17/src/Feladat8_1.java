import java.util.Scanner;

public class Feladat8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Hány szót szeretene megadni? ");
		int hossz= sc.nextInt();
		String tmb[]=new String[hossz]; 
		int maxI=0;
		
		for (int i =0; i < tmb.length; i++) {
			
			System.out.print((i+1)+". Szó: ");tmb[i]=sc.next();
			System.out.println();
		}
		for (int i = 0; i < tmb.length; i++) {
			for (int j = 1; j < tmb.length; j++) {	
				if(tmb[maxI].compareTo(tmb[j])<0) {
					// passz? maxI=i;
			}

			}
		}
		System.out.println(tmb[maxI]);
		
		
		
	}

}
