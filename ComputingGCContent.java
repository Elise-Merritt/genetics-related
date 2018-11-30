package rosalindProjects;
import java.util.*;
import java.io.*;
public class ComputingGCContent {
/* Program reads a text file from user consisting of DNA strings formatted in style specified by Rosalind (see below), 
   computes the GC content (percentage of guanine or cytosine nucleotides) of each string, and returns the identifier of the 
   DNA string with the highest GC content, with it's GC content.
  
Example input file content:
   >Rosalind_6404
	CCTGCGGAAGATCGGCACTAGAATAGCCAGAACCGTTTCTCTGAGGCTTCCGGCCTTCCC
	TCCCACTAATAATTCTGAGG
	>Rosalind_5959
	CCATCGGTAGCGCATCCTTAGTCCAATTAAGTCCCTATCCAGGCGCTCCGCCGAAGGTCT
	ATATCCATTTGTCAGCAGACACGC
	>Rosalind_0808
	CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGAC
	TGGGAACCTGCGGGCAGTAGGTGGAAT
Output would be: 
	Rosalind_0808
	60.91954022988506

Program was written based on problem from Rosalind (http://rosalind.info/problems/gc/)-example input above is from problem description
*/
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a file name.");
		String file = scn.nextLine(), input="", str="";
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bReader=new BufferedReader(reader);
            while((str = bReader.readLine()) != null) {
                input+=str;
            }
            bReader.close();         
        }
        catch(FileNotFoundException e) {               
        }
        catch(IOException e) {
        }
		String currentLabel="", maxGC="";
		double GCcount=0, numNucleo=0, percentage=0;
		HashMap DNAStrings = new HashMap<String, Double>();
		for(int i=0; i<input.length(); i++) {
			char x=input.charAt(i);
			if(i==0){
				currentLabel=input.substring(i+1, i+14);
				maxGC=currentLabel;
			}else if (x=='>') {
				percentage=(GCcount/numNucleo)*100;
				DNAStrings.put(currentLabel, percentage);
				if(percentage>(double)DNAStrings.get(maxGC)) {
					maxGC=currentLabel;
				}
				currentLabel=input.substring(i+1, i+14);
				GCcount=0; numNucleo=0; percentage=0;
			}else if(x=='G' || x=='C') {
				GCcount++;
				numNucleo++;
			}else if(x=='A' || x=='T') {
				numNucleo++;
			}else {
			}
		}
		percentage=(GCcount/numNucleo)*100;
		DNAStrings.put(currentLabel, percentage);
		if(percentage>(double)DNAStrings.get(maxGC)) {
			maxGC=currentLabel;
		}
		System.out.println(maxGC);
		System.out.println(DNAStrings.get(maxGC));
	}

}
