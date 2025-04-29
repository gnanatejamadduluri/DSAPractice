package mains;
import dbConnect.DatabaseConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMain {
	static Scanner S1 = new Scanner(System.in);
	
	public class TPM extends TwoPointerMain {
		
		public static void main(String[] args) {
			
			TwoPointerMain.main(args);
		}
	}
		public class SWM extends SlidingWindowMain {
			
			public static void main(String[] args) {
				
				SlidingWindowMain.main(args);
			}
	}
		public class PSDA extends prefixSumDifferenceArraysMain {
			
			public static void main(String[] args) {
				
				prefixSumDifferenceArraysMain.main(args);
			}
	}
		
		public class KAMSM extends KadanesAlgorithmMaxSubarraySumMain {
			
			public static void main(String[] args) {
				
				KadanesAlgorithmMaxSubarraySumMain.main(args);
			}
	}
	
		public class LLM extends LinkedListMain {
			public static void main(String[] args) {
			LinkedListMain.main(args);
		}
	}
		
		public class SQM extends StackAndQueueMain {
			public static void main(String[] args) {
				StackAndQueueMain.main(args);
		}
	}
		
		/*	public static class loginD extends DatabaseConnect{
			public static void main(String[] args) throws SQLException {
			System.out.println("WELCOME TO DSA PRACTICE! \n\nEnter Username\n");
			String username=S1.next();
			System.out.println("\nEnter the password\n");
			String password=S1.next();
			ResultSet result=test();
			while (result.next()) {
				if(result.getString("email_id")!=username || result.getString("password_")!=password) {
					System.out.println("\n USERNAME OR PASSWORD IS WRONG!!! PLEASE RUN THE APPLICATION AGAIN AND TRY WITH CORRECT CREDENTIALS");
				break;
				}
				if(result.getString("email_id")==username && result.getString("password_")==password) {
					int a=0;
				while (a!=-1) {
					System.out.println("\nChoose from the below options of DSA Topics (enter '-1' to exit \n 1. Two Pointers 2. Sliding Window 3. Prefix Sum & Difference Arrays \n "
							+ "4. Kadane’s Algorithm (Max Subarray Sum) 5. LinkedList"
							+ " 6. Stack & Queue");
					a = S1.nextInt();
					if (a==1) {TPM.main(args); a=0;}
					else if (a==2) {SWM.main(args);a=0;}
					else if (a==3) {PSDA.main(args);a=0;}
					else if (a==4) {KAMSM.main(args);a=0;}
					else if (a==5) {LLM.main(args);a=0;}
					else if (a==6) {SQM.main(args);a=0;}
					}
				if(a==-1) System.out.println("\n\nApplication turned off!! Exit Successfull! See you again!");}
            }
			}
		} */
		
		public static void main(String[] args) throws SQLException {
		//	loginD.main(args);
					
		int a=0;
		while (a!=-1) {
			System.out.println("\nChoose from the below options of DSA Topics (enter '-1' to exit \n 1. Two Pointers 2. Sliding Window 3. Prefix Sum & Difference Arrays \n "
					+ "4. Kadane’s Algorithm (Max Subarray Sum) 5. LinkedList"
					+ " 6. Stack & Queue");
			a = S1.nextInt();
			if (a==1) {TPM.main(args); a=0;}
			else if (a==2) {SWM.main(args);a=0;}
			else if (a==3) {PSDA.main(args);a=0;}
			else if (a==4) {KAMSM.main(args);a=0;}
			else if (a==5) {LLM.main(args);a=0;}
			else if (a==6) {SQM.main(args);a=0;}
			}
		if(a==-1) System.out.println("\n\nApplication turned off!! Exit Successfull! See you again!");
	} 
}
