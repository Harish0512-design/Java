package com.project.euler.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaPrograms {

	public static void main(String[] args) {

		/**************************
		 * 1. swapping of two numbers in 5 types
		 **************************/
//		 int a = 10;
//		 int b = 20;

		// using +,-
//		 a = a + b;
//		 b = a - b;
//		 a = a - b;
//		 System.out.println(a + " " + b);

		// using *,/
//		 a = a*b;
//		 b = a/b;
//		 a = a/b;
//		 System.out.println(a + " " + b);

		// using 3rd variable
//		 int t = a;
//		 a = b;
//		 b = t;
//		 System.out.println(a + " " + b);

		// using xor(^) operator
//		 a = a ^ b;
//		 b = a ^ b;
//		 a = a ^ b;
//		 System.out.println(a + " " + b);

		// single statement
//		 b = (a + b) - (a = b);
//		 System.out.println(a + " " + b);

		 
		 
		/*************************
		 * 2. Reverse a number using 3 ways
		 *********************************/

//		 int number = 29383;

		// 1. using stringBuilder
//		 StringBuilder sb = new StringBuilder(String.valueOf(number));
//		 System.out.println("Reverse of " + number + " is " + sb.reverse());

		// 2. using while loop
//		 int temp = number;
//		 int rem;
//		 int rev = 0;
//		 while (temp > 0) {
//		 rem = temp % 10;
//		 rev = (rev * 10) + rem;
//		 temp = temp / 10;
//		 }
//		
//		 System.out.println(rev);

		// 3. using stringBuffer
//		 StringBuffer sb = new StringBuffer(String.valueOf(number));
//		 System.out.println("Reverse of " + number + " is " + sb.reverse());

		 
		 
		/*************
		 * 3. Reverse a String in 3 different ways
		 *************************************/

//		 String name = "Harish";
		// 1. using charArray() method
		
//		 String reverse = "";
//		 char[] lts = name.toCharArray();
//		
//		 for (int i = lts.length - 1; i >= 0; i--) {
//		 reverse += lts[i];
//		 }
//		 System.out.println("Reverse of " + name + " is " + reverse);

		// 2. using charAt()
//		 String reverse = "";
//		 for (int i = name.length() - 1; i >= 0; i--) {
//		 reverse += name.charAt(i);
//		 }
//		 System.out.println("Reverse of " + name + " is " + reverse);

		// 3. using StringBuilder
//		 StringBuilder sb = new StringBuilder(name);
//		 System.out.println("Reverse of " + name + " is " + sb.reverse());

		 
		 
		/************** 4. Palindrome Number *****************************/

//		 int number = 111112;
//		 int temp = number;
//		 int reverse = 0;
//		 while (temp > 0) {
//		 reverse = (reverse * 10) + (temp % 10);
//		 temp = temp / 10;
//		 }
//		 if (number == reverse) {
//		 System.out.println("Palindrome..");
//		 } else {
//		 System.out.println("not a palindrome..");
//		 }


		 /********************** 5. Palindrome String ***********************/

//		 String name = "abccba";
//		 String rev = "";
//		 for (int i = name.length() - 1; i >= 0; i--) {
//		 rev += name.charAt(i);
//		 }
//		
//		 if (name.equals(rev)) {
//		 System.out.println("Palindrome String..");
//		 } else {
//		 System.out.println("Not a palindrome..");
//		 }

		/*************
		 * 6. Count number of digits in a number
		 *******************/

		// int number = 123829283;
		// int count = 0;
		// while (number > 0) {
		// count++;
		// number = number / 10;
		// }
		// System.out.println(count);

		/*************
		 * 7. count even and odd digits in a number
		 *****************************/

		// int number = 28383939;
		// int even = 0;
		// int odd = 0;
		// int rem = 0;
		// while (number > 0) {
		// rem = number % 10;
		// if (rem % 2 == 0) {
		// even++;
		// } else {
		// odd++;
		// }
		// number = number / 10;
		// }
		// System.out.println(even + " , " + odd);

		/******************
		 * 8. sum of digits in a number
		 **************************/

		// int number = 1234;
		// int sumOfDigits = 0;
		// while (number > 0) {
		// sumOfDigits += number % 10;
		// number = number / 10;
		// }
		// System.out.println(sumOfDigits);

		/************* 9. find largest of 3 numbers ***********************/

		/******* normal process *****************/
		// int a, b, c;
		// a = -10;
		// b = 0;
		// c = 1;
		//
		// if (a > b && a > c) {
		// System.out.println("a is greatest");
		// } else if (b > a && b > c) {
		// System.out.println("b is greatest");
		// } else {
		// System.out.println("c is greatest");
		// }

		/********************* Ternary Operator *********************/

		// int largest = a > b ? a : b;
		// largest = c > largest ? c : largest;
		//
		// System.out.println(largest + " is the largest");

		/*************** Ternary operator in single statment ****************/
		// int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
		// System.out.println(largest + " is the largest");

		/*********** 10. Fibonacci series **************/

		// int a = 0;
		// int b = 1;
		// int n = 10;
		// int c;
		// System.out.print(a);
		// System.out.print(",");
		// while (b <= n) {
		// System.out.print(b);
		// System.out.print(",");
		// c = a + b;
		// a = b;
		// b = c;
		// }

		/*****************
		 * 11. check number is prime or not
		 ************************/

		// int number = 13;
		// boolean flag = true;
		// for (int i = 2; i < number / 2; i++) {
		// if (number % i == 0) {
		// flag = false;
		// break;
		// }
		// }
		// if (flag) {
		// System.out.println("NUmber is prime");
		// } else {
		// System.out.println("Number is not prime");
		// }
		//

		/********************
		 * 12. Generate random numbers
		 ***********************/

		// Random rand = new Random();
		// int randomInteger = rand.nextInt(100);
		//
		// double randomDouble = rand.nextDouble(); // 0.0 to 1.0
		//
		// double rndmIntegerThroughtMath = Math.random(); // 0.0 to 1.0
		//
		// System.out.println(randomInteger + " " + randomDouble + " " +
		// rndmIntegerThroughtMath);

		/******************** 13.Factorial of a number ******************/

		// int number = 5;
		// int fact = 1;
		// while (number > 0) {
		// fact *= number;
		// number = number - 1;
		// }
		// System.out.println(fact);

		/**************** 14. SUm of elements in Array ***************/

		// int[] arr = { 1, 3, 49, 29, 10 };
		// int sum = 0;
		// for (int i = 0; i < arr.length; i++) {
		// sum += arr[i];
		// }
		// System.out.println(sum);

		/************ 15. print even & odd from array ***********/

		// int[] arr = { 10, 20, 49, 48, 2, 4, 4, 5, 7, 11 };
		//
		// ArrayList<Integer> even = new ArrayList<Integer>();
		// ArrayList<Integer> odd = new ArrayList<Integer>();
		//
		// for (int a : arr) {
		// if (a % 2 == 0) {
		// even.add(a);
		// } else {
		// odd.add(a);
		// }
		// }
		// System.out.println(even);
		// System.out.println(odd);

		/****************
		 * 16. check two arrays are equal or not
		 **************************/

		// int[] arr1 = { 12, 12, 11 };
		// int[] arr2 = { 12, 12, 11 };

		/****** approach 1 *********/
		// boolean isEqual = Arrays.equals(arr1, arr2);
		// if (isEqual) {
		// System.out.println("Both arrays are equal");
		// } else {
		// System.out.println("Both arrays are not equal");
		// }

		/******** approach 2 *********/
		//
		// boolean status = true;
		// if (arr1.length == arr2.length) {
		//
		// for (int i = 0; i < arr1.length; i++) {
		// if (arr1[i] != arr2[i]) {
		// status = false;
		// break;
		// }
		// }
		//
		// if (status) {
		// System.out.println("BOth arrays are equal");
		// } else {
		// System.out.println("Both arrays are not equal");
		// }
		//
		// } else {
		// System.out.println("Both arrays are not equal");
		// }

		/************* 17. find missing number in array ***********************/

		// int[] arr = { 1, 2, 4, 5, 6 };
		// int sum = 0;
		// for (int i = 1; i <= 6; i++) {
		// sum += i;
		// }
		// int asum = 0;
		// for (int e : arr) {
		// asum += e;
		// }
		// if (sum == asum) {
		// System.out.println("no number is missing..");
		// } else {
		// int mis = sum - asum;
		// System.out.println(mis);
		// }

		/************
		 * 18. find max and min from the given array
		 ******************/

		// int[] arr = { 12, 19, 3, 9, 38, 9 };
		//
		// int min = arr[0];
		// int max = arr[0];
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] < min) {
		// min = arr[i];
		// }
		// if (arr[i] > max) {
		// max = arr[i];
		// }
		// }
		// System.out.println(min);
		// System.out.println(max);

		/****************
		 * 19. find duplicates in Array
		 *******************************/

		// int[] arr = { 12, 12, 1, 3, 4, 5, 3, 4, 3 };
		//
		// HashSet<Integer> hs = new HashSet<Integer>();
		// for (int e : arr) {
		// hs.add(e);
		// }
		//
		// for (int e : hs) {
		// int c = 0;
		// for (int a : arr) {
		// if (e == a) {
		// c++;
		// }
		// }
		// if (c > 1) {
		// System.out.println("Duplicate number " + e + " appeared " + c + "
		// times");
		// }
		// }

		/******************
		 * 20. search element in array
		 ********************************/
		/***** 1. Linear search *******/

		// int arr[] = { 12, 12, 193, 9, 92, 9 };
		//
		// int searchElement = 9;
		//
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] == searchElement) {
		// System.out.println("Element found at index: " + i);
		// }
		// }

		/***** 2. Binary Search (sorted array) *******/
		// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// int searchElement = 3;
		// boolean isFound = false;
		// int firstIdx = 0;
		// int lastIdx = arr.length - 1;
		//
		// while (firstIdx <= lastIdx) {
		// int midIdx = (firstIdx + lastIdx) / 2;
		//
		// if (arr[midIdx] == searchElement) {
		// isFound = true;
		// break;
		// }
		//
		// if (searchElement < arr[midIdx]) {
		// lastIdx = midIdx - 1;
		// }
		//
		// if (searchElement > arr[midIdx]) {
		// firstIdx = midIdx + 1;
		// }
		// }
		//
		// if (isFound) {
		// System.out.println("Element found");
		// } else {
		// System.out.println("ELement not found");
		// }

		/********** using Arrays **************/
		//
		// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// int ele = 12;
		//
		// // prints the index of value if found else returns -ve value-
		// System.out.println(Arrays.binarySearch(arr, ele));

		/************* 21. sort elements in array ****************/

		/****** Bubble Sort ************/

		// int arr[] = { 23, 18, 93, 82, 13, 1 };
		// int n = arr.length;
		// for (int i = 0; i < n - 1; i++) {
		// for (int j = 0; j < n - 1; j++) {
		// if (arr[j] > arr[j + 1]) {
		// int t = arr[j];
		// arr[j] = arr[j + 1];
		// arr[j + 1] = t;
		// }
		// }
		// }
		//
		// for (int a : arr) {
		// System.out.println(a);
		// }

		/***********
		 * 22. sorting elements in Array using built-in methods
		 ********************/

		// int arr[] = { 92, 8, 9, 1, 2, 0, 10 };
		// System.out.println("Before sorting:: " + Arrays.toString(arr));

		/********* Ascending order **************/
		// Approach-1 -- parallelSort() method
		// Arrays.parallelSort(arr);

		// Approach-2 -- sort() method
		// Arrays.sort(arr);
		// System.out.println("After sorting:: " + Arrays.toString(arr));

		/********** Descending order ****************/
		// Integer ar[] = { 10, 29, 2, 9, 1, 0, 8989 }; // datatype should not
		// be
		// // primitive type
		// Arrays.sort(ar, Collections.reverseOrder());
		// System.out.println("After sorting:: " + Arrays.toString(ar));

		/********** 23. Remove special chars in Strings *************/

		// String name = "Hair&(@)@(-23# &*@!#$%()*#*@!!)!#*";
		//
		// String new_name = name.replaceAll("[^a-zA-Z0-9]", "");
		// System.out.println(new_name);

		/******* 24. Remove white spaces in a String **********/

		// String para = " Hairhsoi aoelwo al 3 fs 02 l9 ";
		//
		// String newPara = para.replaceAll("\\s", ""); // "\\s" means spaces.
		// System.out.println(newPara);

		/*********** 25. Count occurance of a character in String *********/
		// String name = "hai hai 89a i1a";
		//
		// int totalLength = name.length();
		// int countLength = name.replaceAll("[a]", "").length();
		// System.out.println("Total Chars: "+
		// String.valueOf(totalLength-countLength));

		/********** 26. COunt words in a String *************/
		// String sentence = "Hi! How are You?";
		// String[] words = sentence.split(" ");
		// System.out.println(words.length);

		/********* 27. Reverse each word in String *************/

		// String sentence = "Welcome to Java Programming";
		// String[] words = sentence.split(" ");
		// for (int i = 0; i < words.length; i++) {
		// String w = words[i];
		// char[] s = w.toCharArray();
		// String n = "";
		// for (int j = w.length() - 1; j >= 0; j--) {
		// n += s[j];
		// }
		// words[i] = n;
		// }
		// String newRev = "";
		// for (String s : words) {
		// newRev += s + " ";
		// }
		// System.out.println(sentence.length());
		// System.out.println(newRev.length());
		//
		// System.out.println(newRev.substring(0, newRev.length() - 1));

		/*******************
		 * 28. Read data from text file
		 ***************************/
		try {

			FileReader fr = new FileReader(System.getProperty("user.dir") + "\\sample.txt");
			BufferedReader br = new BufferedReader(fr);

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/******************* 29. Write data in text File *****************/

		try {
			FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\sample.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Selenium with java");
			bw.write("Selenium with C#");
			bw.write("Selenium with python");

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}