package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colection {

	public static void main(String[] args) {
		//Sort Array And Remove Duplicate
		int []arr = {9,7,5,4,8,6,1,4,5,1,3,4,2,4,1,1,5,1,4,6,1,4,6,4,6};
		
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			lhs.add(arr[i]);
		}
		System.out.println();
		System.out.println(lhs);System.out.println(lhs.size());
		TreeSet<Integer> ts=new TreeSet<>();
		for(int j=0;j<arr.length;j++) {
			ts.add(arr[j]);
		}
		System.out.println(ts);
		NavigableSet<Integer> ns=ts.descendingSet();
		System.out.println(ns);
		
		//Sort String Array And Remove Duplicate
		ArrayList<String> al=new ArrayList<>();
		al.add("Sarang");al.add("Ravi");al.add("Shubham");al.add("Ravi");al.add("Sarang");
		System.out.println(al);
		TreeSet<String> ts1=new TreeSet<>();
		ts1.addAll(al);
		ts1.add("Rnga");ts1.add("Zara");ts1.add("Sush");
		System.out.println(ts1);
		
		//Counting Character 
		String s="aabbsdgahdgaadjyfdjvfjscyisgskjfygsygfksguktsfysggykszxxagyszzz";
		char[]chararray=s.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<>();
		for(char ch:chararray) {
			if(tm.containsKey(ch)) {
				tm.put(ch,tm.get(ch)+1);
			}else {
				tm.put(ch,1);
			}
		}
		System.out.println(tm);
		
		//Even N Odd.
		int num=20;
		int x=0;
		while(x<=num) {
			if(x%2==0) {
				System.out.print("Even "+x);
			}else { System.out.println("  Odd "+x);}
			x++;
		}
		
		//Reverse String 
		String S="Sarang Mahajan";
		String Rev="";
		for(int z=S.length()-1;z>=0;z--) {
			Rev=Rev+ S.charAt(z);
		}
		System.out.println(Rev);
		
		//middle characters
		String A="SarangMahajanBharadi";
		int l=A.length();
		String M=A.substring(A.length()/2-1,A.length()/2+1);
		System.out.println(M);
		
		
		
		
	}

}
