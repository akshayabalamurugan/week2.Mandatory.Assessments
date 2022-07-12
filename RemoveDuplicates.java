package week1.day2.assignments.mandatory;
public class RemoveDuplicates {
public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split(" ");
		int lg1= text1.length;
		int x = 0;
		for (int i = 0; i<lg1; i++) {
			for (int j = i+1; j <lg1; j++) {
				if (text1[i].equalsIgnoreCase(text1[j])) {
					x++;
					if (x>1) {
						text1[i]="";
				}
			}	
			}
			System.out.print(text1[i]+" ");
			}
			}
			}

		
	


