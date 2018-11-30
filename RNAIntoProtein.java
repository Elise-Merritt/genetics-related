package rosalindProjects;
import java.util.*;
public class RNAIntoProtein {
/* Program takes a mRNA string and translates it into a protein string.
  
   Sample input:
   AAUGCCCAUG 
   Output would be:
   Protein is MPM
   
   Program based on problem from Rosalind (http://rosalind.info/problems/prot/) */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a mRNA string.");
		String mRNA = scn.nextLine(), mRNAcodon="", protein="";
		int start=mRNA.indexOf("AUG");
		for(int i=start; i<mRNA.length()-1; i++) {
			mRNAcodon=mRNA.substring(i, i+3);
			i=i+2;
		if (mRNAcodon.equals("UAA") || mRNAcodon.equals("UAG") || mRNAcodon.equals("UGA")) {
				break;
		}else if(mRNAcodon.equals("GCA") || mRNAcodon.equals("GCC") || mRNAcodon.equals("GCG") || mRNAcodon.equals("GCU")) {
				protein+=("A");
		}else if(mRNAcodon.equals("UGC") || mRNAcodon.equals("UGU")) {
				protein+=("C");
		}else if(mRNAcodon.equals("GAC") || mRNAcodon.equals("GAU")) {
				protein+=("D");
		}else if(mRNAcodon.equals("GAA") || mRNAcodon.equals("GAG")) {
				protein+=("E");
		}else if(mRNAcodon.equals("UUC") || mRNAcodon.equals("UUU")) {
				protein+=("F");
		}else if(mRNAcodon.equals("GGA") || mRNAcodon.equals("GGC") || mRNAcodon.equals("GGG") || mRNAcodon.equals("GGU")) {
				protein+=("G");
		}else if(mRNAcodon.equals("CAC") || mRNAcodon.equals("CAU")) {
				protein+=("H");
		}else if(mRNAcodon.equals("AUA") || mRNAcodon.equals("AUC") || mRNAcodon.equals("AUU")) {
				protein+=("I");
		}else if(mRNAcodon.equals("AAA") || mRNAcodon.equals("AAG")){
				protein+=("K");
		}else if(mRNAcodon.equals("CUA") || mRNAcodon.equals("CUC") || mRNAcodon.equals("CUG") || mRNAcodon.equals("CUU") || mRNAcodon.equals("UUA") || mRNAcodon.equals("UUG")) {
				protein+=("L");
		}else if(mRNAcodon.equals("AUG")) {
				protein+=("M");
		}else if(mRNAcodon.equals("AAC") || mRNAcodon.equals("AAU")) {
				protein+=("N");
		}else if(mRNAcodon.equals("CCA") || mRNAcodon.equals("CCC") || mRNAcodon.equals("CCG") || mRNAcodon.equals("CCU")) {
				protein+=("P");
		}else if(mRNAcodon.equals("CAA") || mRNAcodon.equals("CAG")) {
				protein+=("Q");
		}else if(mRNAcodon.equals("AGA") || mRNAcodon.equals("AGG") || mRNAcodon.equals("CGA") || mRNAcodon.equals("CGA") || mRNAcodon.equals("CGC") || mRNAcodon.equals("CGG") || mRNAcodon.equals("CGU")) {
				protein+=("R");
		}else if(mRNAcodon.equals("AGC") ||mRNAcodon.equals("AGU") || mRNAcodon.equals("UCA") || mRNAcodon.equals("UCC") || mRNAcodon.equals("UCG") || mRNAcodon.equals("UCU")) {
				protein+=("S");
		}else if(mRNAcodon.equals("ACA") || mRNAcodon.equals("ACC") || mRNAcodon.equals("ACG") || mRNAcodon.equals("ACU")) {
				protein+=("T");
		}else if(mRNAcodon.equals("GUA") || mRNAcodon.equals("GUC") || mRNAcodon.equals("GUG") || mRNAcodon.equals("GUU")) {
				protein+=("V");
		}else if(mRNAcodon.equals("UGG")) {
				protein+=("W");
		}else if(mRNAcodon.equals("UAC") || mRNAcodon.equals("UAU")) {
				protein+=("Y");
		}else {
		}
				
	}
		System.out.println("Protein is " +protein);
	}
	

}
