package subjectServices;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import linkedListNeeds.Node;
import mains.LinkedListMain;
import mains.TwoPointerMain;

@CrossOrigin
@RestController
@RequestMapping("/LinkedLists")
public class LinkedListServices {
	 @GetMapping("/SinglyLinkedList")
	 public Map<String, String> getSinglyLinkedList() {
		 Map<String, String> response = LinkedListMain.SLL.main(null);
		 return response;
	    }
	 
	 @GetMapping("/DoublyLinkedList")
	 public Map<String, String> getPDoublyLinkedList() {
		 Map<String, String> response = LinkedListMain.DLL.main(null);
		 return response;
	    }
	
	 @GetMapping("/CircularPlaylist")
	 public Map<String, String> getCircularPlaylist() {
		 Map<String, String> response = LinkedListMain.CPL.main(null);
		 return response;
	 	}

	 @GetMapping("/BrowserHistory")
	 public Map<String, String> getBrowserHistory() {
		 Map<String, String> response = LinkedListMain.BH.main(null);
		 return response;
	 	}

	 @GetMapping("/CircularQueue")
	 public Map<String, String> getCircularQueue() {
		 Map<String, String> response = LinkedListMain.CQ.main(null);
		 return response;
	 	}

	 @GetMapping("/RoundRobinScheduler")
	 public Map<String, String> getRoundRobinScheduler() {
		 Map<String, String> response = LinkedListMain.RRS.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/CycleDetection")
	 public String getCycleDetection() {
		 String response = LinkedListMain.CD.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/MiddleOfList")
	 public String getMiddleOfList() {
		 String response = LinkedListMain.MOL.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/StartOfCycle")
	 public String getStartOfCycle() {
		 String response = LinkedListMain.SOC.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/PalindromeLinkedList")
	 public String getPalindromeLinkedList() {
		 String response = LinkedListMain.PLL.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/ArrayCycleDetection")
	 public String getArrayCycleDetection() {
		 String response = LinkedListMain.ACD.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/ReverseLinkedListIterative")
	 public String getReverseLinkedListIterative() {
		 String response = LinkedListMain.RLLI.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/ReverseLinkedListRecursive")
	 public String getReverseLinkedListRecursive() {
		 String response = LinkedListMain.RLLR.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/ReverseBetween")
	 public String getReverseBetween() {
		 String response = LinkedListMain.RBT.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/ReverseKGroup")
	 public String getReverseKGroup() {
		 String response = LinkedListMain.RKG.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/MergeSortedLists")
	 public String getMergeSortedLists() {
		 String response = LinkedListMain.MSL.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/SplitList")
	 public String getSplitList() {
		 String response = LinkedListMain.SPL.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/MergeKSortedLists")
	 public String getMergeKSortedLists() {
		 String response = LinkedListMain.MKSL.main(null);
		 return response;
	 	}
	 
	 @GetMapping("/SplitByValue")
	 public String getSplitByValue() {
		 String response = LinkedListMain.SBV.main(null);
		 return response;
	 	}

}