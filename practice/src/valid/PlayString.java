package valid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PlayString {

	public static void main(String[] args) throws NumberFormatException, IOException {
	  int c1=0;
	
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		
		
		if(tc>=1 && tc<=100) {
		long c[]=new long[tc];
		long d[]=new long[tc];
		long n[]=new long[tc];
		for(int i=0;i<tc;i++) {
			c[i]=Long.parseLong(br.readLine());
			d[i]=Long.parseLong(br.readLine());
			n[i]=Long.parseLong(br.readLine());
			
		}
		int count=0;

		for(int i=0;i<tc;i++) {
			
			if(n[i]>=1 && n[i]<=10000000) {
				
				if(d[i]>=1 && d[i]<c[i] && d[i]<n[i]) {
			count=0;
			long k =c[i];
			while(!(k==n[i])){
				k=k-d[i];
				k=k+c[i];
				count++;
			}

			count=count+1;
			System.out.println(count);
			}
				
				else {
					c1++;
					break;
				}
				
			}
			
			else {
				c1++;
				break;
			}
			

		}

		}
		
		
		else {
			
			System.out.println("Not a valid input");
		}
		
		if(c1!=0) {
			
			System.out.println("Not a valid input");
		}
	}

}
