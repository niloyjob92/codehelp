package valid;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNonDuplicateNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int len=sc.nextInt();
		int [] arr=new int[len];
		for(int g=0;g<len;g++) {
			
			arr[g]=sc.nextInt();
		}

		List<Integer> li=new ArrayList<Integer>();
		for(int k=0;k<len;k++) {
			
			li.add(arr[k]);
		}
		System.out.println(li);
		
		Set<Integer> se1=new LinkedHashSet<Integer>();
		Set<Integer> se2=new LinkedHashSet<Integer>();
		for(int y=0;y<len;y++) {
			
			if(!(se1.add(li.get(y)))) {
				
				se2.add(li.get(y));
			}
			
			
		}
		
		System.out.println("The collection of numbers without duplication \n" +se1);
		System.out.println("The collection of numbers with duplication \n" +se2);
		
		

	}

}
