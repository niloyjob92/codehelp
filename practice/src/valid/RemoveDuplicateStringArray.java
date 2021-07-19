package valid;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateStringArray {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size1=sc.nextInt();
		String[] arr1=new String[size1];
		System.out.println("Enter the elements");
		for(int k=0;k<size1;k++) {
			
			arr1[k]=sc.next();
			//System.out.println(arr1[k]);
		}
		
		List<String> li=new ArrayList<String>();
		for (int p=0;p<size1;p++)
		{
			li.add(arr1[p]);
		}
		System.out.println(li);
		Set<String>  se1 =new LinkedHashSet<String>();
		se1.addAll(li);
		System.out.println(se1);
	}

}
