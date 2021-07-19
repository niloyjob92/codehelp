package valid;

import java.util.Scanner;

public class CountPallindromeGivenString {

	public static void main(String[] args) {
		String str2="";
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string");
		String str=sc.nextLine();
		String [] arr1=str.split(" ");
		for (int k=0;k<arr1.length;k++) {
			String str3="";
			str2=arr1[k].toLowerCase();
			for(int p=str2.length()-1;p>=0;p--) {
				
				str3=str3+str2.charAt(p);
			}
			//System.out.println(str3);
			
			if(str3.equalsIgnoreCase(str2)) {
				count++;
				
			}
			
		}
		
		if(count==0) {
			
			System.out.println("No pallindrome strings are generated from the sentence.");
		}
		
		else
			
			System.out.println("No of pallindrome strings generated are "+ count);

	}

}
