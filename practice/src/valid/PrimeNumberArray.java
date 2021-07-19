package valid;

import java.util.Scanner;

public class PrimeNumberArray {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int p=0;p<len;p++) {
			
			arr[p]=sc.nextInt();
		}
		
		for(int l=0;l<len;l++) {
			flag=false;
			for(int i=2;i<=arr[l]/2;i++) {
				
				
				if(arr[l]%i==0) {
					flag=true;
					break;
				}
					
			}
			
			if(flag==false)
				System.out.println(arr[l]);
		}

	}

}
