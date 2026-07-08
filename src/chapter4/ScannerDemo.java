package chapter4;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] str) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		
		String stname = sc.nextLine();
		
		System.out.println("Enter Rank : ");
		
		int strank = sc.nextInt();
		
		System.out.println("Enter Mark : ");
		
		double stmark = sc.nextDouble();
		
		System.out.println("Name : " + stname);
		
		System.out.println("Rank : " + strank);
		
		System.out.println("Mark : " + stmark);
	}
 }
