package mains;
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
		
		public static void main(String[] args) {
		System.out.println("Choose from the below options of DSA Topics \n 1. Two Pointers 2. Sliding Window 3. Prefix Sum & Difference Arrays \n "
				+ "4. Kadane’s Algorithm (Max Subarray Sum) 5. LinkedList"
				+ " 6. Stack & Queue");
		int a = S1.nextInt();
		while (a!=-1) {
			if (a==1) {TPM.main(args); a=0;}
			else if (a==2) {SWM.main(args);a=0;}
			else if (a==3) {PSDA.main(args);a=0;}
			else if (a==4) {KAMSM.main(args);a=0;}
			else if (a==5) {LLM.main(args);a=0;}
			else if (a==6) {SQM.main(args);a=0;}
			else {break;}
			}
	}
}
