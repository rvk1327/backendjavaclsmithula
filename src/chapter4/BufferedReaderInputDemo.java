package chapter4;

import java.io.*;

public class BufferedReaderInputDemo {

	public static void main(String[] str) {
		
		try {
			
			InputStreamReader ir = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(ir);
			
			System.out.println("Enter Name : ");
			
			String stname = br.readLine();
			
			System.out.println("Enter Rank : ");
			
			String rank = br.readLine();
			
			int strank = Integer.parseInt(rank);
			
			System.out.println("Enter Mark : ");
			
			String mark = br.readLine();
			
			double stmark = Double.parseDouble(mark);
			
			System.out.println("Name : " + stname);
			
			System.out.println("Rank : " + strank);
			
			System.out.println("Mark : " + stmark);
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
