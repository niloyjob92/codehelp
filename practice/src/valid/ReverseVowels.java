package valid;

import java.util.Scanner;

public class ReverseVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String input");
		String inp=sc.nextLine();
		String out="";
		int count=0;
		for(int y=inp.length()-1;y>=0;y--) {
			
			if(inp.charAt(y)=='A' || inp.charAt(y)=='E' ||inp.charAt(y)=='I' ||inp.charAt(y)=='O' ||inp.charAt(y)=='U' 
					||inp.charAt(y)=='a' || inp.charAt(y)=='e' ||inp.charAt(y)=='i' ||inp.charAt(y)=='o' ||inp.charAt(y)=='u') {
				
				out=out + inp.charAt(y);
				
			} 
			
			else
				
				count++;
		}
		
		if(count==inp.length()) {
			
			System.out.println("No vowels are available in the input");
		}
		
		else {
			
			System.out.println("The required output is "+ out);
		}

	}

}
