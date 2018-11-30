package rosalindProjects;
import java.util.*;
public class CountingDNANucleotides {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numA=0, numC=0, numT=0, numG=0;
		System.out.println("Enter a string of nucleotides (example: ATCGACG)");
		String input = scn.nextLine();
		for(int i=0; i<input.length(); i++) {
			char nucleo = input.charAt(i);
			if(nucleo=='A' || nucleo=='a' ) {
				numA++;
			}else if (nucleo=='T' || nucleo=='t') {
				numT++;
			}else if (nucleo=='G' || nucleo=='g') {
				numG++;
			}else if(nucleo=='C' || nucleo=='c') {
				numC++;
			}
		}
		System.out.println("A: "+numA);
		System.out.println("G: "+numG);
		System.out.println("C: "+numC);
		System.out.println("T "+numT);
	}
}
