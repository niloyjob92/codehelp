package valid;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str3=sc.next();
		System.out.println("Enter the second string");
		String str4=sc.next();
		String str1=str3.toLowerCase();
		String str2=str4.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			
			System.out.println("The strings are not anagram");
		}
		
		else {
			
			char[] char1 = str1.toCharArray();
			char[] char2= str2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			if(Arrays.equals(char1, char2)==true) {
				
				System.out.println("The strings are anagram");
			}
			else {
			System.out.println("The strings are not anagram");
			}
		}
		
		

	}

}
