package week1.day2.assignments.mandatory;
public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] testArray= test.split(" ");
		int lengthTestArray= testArray.length;
		for (int i = 0; i <= lengthTestArray-1; i++) {
			if (i%2 != 0) {
				String str1= testArray[i].toString();
				char[] chr1= str1.toCharArray();
				 for (int j = chr1.length-1; j>=0; j--) {
						chr1[j]=chr1[j];
						System.out.print(chr1[j]);
						}
				}		 
			else {
				System.out.print(" "+testArray[i]+ " ");				
			}
			}
			}
			}	

