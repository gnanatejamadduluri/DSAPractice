package mains;
import java.util.Scanner;

import prefixSumDifferenceArrays.DifferenceArrayExample;
import prefixSumDifferenceArrays.PrefixSumExample;
import prefixSumDifferenceArrays.RangeSumQuery;

public class prefixSumDifferenceArraysMain {
	static Scanner S1 = new Scanner(System.in);
	
	public class PSE extends PrefixSumExample {
		
	} 
	
	public class RSQ extends RangeSumQuery {
		
	}
	
	public class DAE extends DifferenceArrayExample {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Choose from the below options of Prefix sum & difference arrays\r\n"
				+ "\r\n"
				+ " \n 1. PrefixSumExample 2. RangeSumQuery 3. DifferenceArrayExample \n");
		int a = S1.nextInt();
		while (a!=-1) {
		if (a==1) {PSE.main(args); a=0;}
		else if (a==2) {RSQ.main(args);a=0;}
		else if (a==3) {DAE.main(args);a=0;}
		else {break;}
	}
}
}
