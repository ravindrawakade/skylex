package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.TreeSet;

public class ReverseArrayusingCollections {

	public static void main(String[] args) {
		int [] arr= {10,20,10,30,20,30,50,70,80,90,45,4,5};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.print(set);
		//TreeSet<Integer> ts=new TreeSet<Integer>();
		
		String[] a= {"Sarang","Ravi","Shubham","Rahul","Hitesh","Anjali"};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]+" ");
			
			System.out.println();
		}
		
		

		

	}

}
