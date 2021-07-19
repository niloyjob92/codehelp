package valid;

import java.util.Scanner;

public class SentenceReverse {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input string");
		String str= sc.nextLine();
		String str3="";
		String str4="";
		String str5="";
		
	String[] str2=str.split(" ");
	
	for(int p=str2.length-1;p>=0;p--) {
		
		if(p==0) {
			
			for(int g=str2[p].length()-1;g>=0;g--) {
				
				str4+=str2[p].charAt(g);
				
			}
		}
		
		else {
			str3=str3 + str2[p] + " ";
			
		}
	}
	
	str5=str3+str4;
	System.out.println(str5);

	}

}
