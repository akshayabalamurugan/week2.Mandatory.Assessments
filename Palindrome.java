package week1.day2.assignments.mandatory;
public class Palindrome {
public static void main(String[] args) {
String str1= "Madam";
String str2= "";
int lengthOfstr1= str1.length();
for (int i=lengthOfstr1-1; i>=0; i--) {
	str2= str2+ str1.charAt(i);
}
 if (str1.equalsIgnoreCase(str2)) {
	 System.out.println(str1+" is a palindrome");	
}
 else
	 System.out.println(str1+ " is not a palindrome");
}
}
