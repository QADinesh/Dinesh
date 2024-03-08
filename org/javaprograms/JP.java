package org.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class JP {
	
	
	//Kumar branch codes
	
	
	//1).Reverse a String without inbuilt function
	private void stringReverse() {
		String S1="Hello Dineshkumar welcome to kumar branch codes";
		char[] charArray = S1.toCharArray();
		System.out.println("Original String : "+S1);
		System.out.print("Reversed String : ");
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);	
		}
		
		StringBuilder builder=new StringBuilder();
		builder.append(S1);
		builder = builder.reverse();
		System.out.println();
		System.out.println(builder);
	}
	
	//2).Reverse a String each word same order without inbuilt function
	private void eachWordReverse() {
		String S1="Hello Dineshkumar welcome to software testing";
		String[] eachWord = S1.split(" ");
		String res="";
		for (int i = 0; i < eachWord.length; i++) {
			char[] charArray = eachWord[i].toCharArray();
			String S2="";
			for (int j = charArray.length-1; j>=0; j--) {
				S2+=charArray[j];
			}
			res+=S2+" ";
		}
		System.out.println(res);
	}
	
	//3).Swap two numbers using third variable
	private void swapTwoNumbers() {
		int a=10;
		int b=20;
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	
	//4).Swap two numbers using third variable
	private void swapTwoNuumberWithoutThirdVar() {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

	//5).Each word count in string
	private void wordsCount() {
		String S1="This this is is done by Saket Saket";
		Map<String,Integer> wordCount=new HashMap<String,Integer>();
		String[] split = S1.split(" ");
		for (int i = 0; i < split.length; i++) {
			String key=split[i];
			if(wordCount.containsKey(key)) {
				Integer count = wordCount.get(key);
				wordCount.put(key, count+1);
			}
			else {
				wordCount.put(key, 1);	
			}
		}
		String string = wordCount.toString();
		System.out.println(string);
		

	}

	//6).Iterate Hashmap using While and Enhanced for loop
	private void iterateHashMap() {
		String S1="This this is is done by Saket Saket";
		Map<String,Integer> wordCount=new HashMap<String,Integer>();
		String[] split = S1.split(" ");
		for (int i = 0; i < split.length; i++) {
			String key=split[i];
			if(wordCount.containsKey(key)) {
				Integer count = wordCount.get(key);
				wordCount.put(key, count+1);
			}
			else {
				wordCount.put(key, 1);	
			}
		}
		
		//Using Enhanced for loop
		Set<Entry<String, Integer>> entrySet = wordCount.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		
		//Using Enhanced for loop
		Set<String> keySet = wordCount.keySet();
		Object[] entryList =keySet.toArray();
		int count=0;
		while(entryList.length>count) {
			Object key = entryList[count];
			Integer value = wordCount.get(key);
			System.out.println(key+" : "+value);
			count++;
		}
	}
	
	//7).Check number is prime or not
	private void checkPrime() {
		System.out.println("Enter the no :");
		Scanner scanner=new Scanner(System.in);
		int num = scanner.nextInt();
		boolean prime=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				prime=false;
			}
		}
		if(prime) {
			System.out.println("Number is a prime number");
		}
		else {
			System.out.println("Number Not prime number");
		}
	}
	
	//8).Check String or Number is palindrome or not
	private void checkPolindrome() {
		System.out.println("String or Number");
		Scanner scanner=new Scanner(System.in);
		String type = scanner.next();
		switch(type.toLowerCase()) {
		case "string":
			System.out.println("Enter the String");
			String str=scanner.next();
			StringBuilder builder=new StringBuilder(str);
			System.out.println(builder);
			StringBuilder reverse = builder.reverse();
			if(reverse.equals(builder)) {
				System.out.println("String is Polindrome");
			}
			else {
				System.out.println("String is not a polindrome");
			}
			break;
		case "number":
			System.out.println("Enter the Number");
			int num=scanner.nextInt();
			int temp=num;
			int res=0;
			while(temp>0) {
				res=(res*10)+temp%10;
				temp/=10;
			}
			if(res==num) {
				System.out.println("Number is Polindrome");
			}
			else {
				System.out.println("Number is not Polindrome");
			}
			break;
		}
		

	}

	
	public static void main(String[] args) {
		JP jp=new JP();
		jp.checkPolindrome();
	}
	

}
