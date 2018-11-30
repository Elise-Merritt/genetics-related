numA=0
numC=0
numT=0
numG=0
input = raw_input('Enter a string of nucleotides (example: ATCGACG)')
for i=0 in range(len(input) {
char nucleo = input.charAt(i);
if(nucleo=='A' || nucleo=='a' ) {
	numA++;
if (nucleo=='T' || nucleo=='t'):
	numT++;
if (nucleo=='G' || nucleo=='g'):
	numG++;
if(nucleo=='C' || nucleo=='c'):
	numC++;
}
}
print("A: "+numA);
print("G: "+numG);
print("C: "+numC);
print("T "+numT);
}
}