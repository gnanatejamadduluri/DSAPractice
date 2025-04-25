package mains;
import java.util.Scanner;

public class MainMain {
	static Scanner S1 = new Scanner(System.in);
	
	public class TPM extends TwoPointerMain {
		
		public static void main(String[] args) {
			
			TwoPointerMain.main(args);
		}
	}

	public static void main(String[] args) {
		System.out.println("Choose from the below options of DSA Topics \n 1. Two Pointers 2. Two Sum Sorted 3. RemoveDuplicates \n");
		int a = S1.nextInt();
		while (a!=-1) {
			if (a==1) {TPM.main(args); a=0;}
			else {break;}
			}
	}
}
