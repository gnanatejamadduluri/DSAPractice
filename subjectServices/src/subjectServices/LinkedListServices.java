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
	 public Map<String, String> getCycleDetection() {
		 Map<String, String> response = LinkedListMain.CD.main(null);
		 return response;
	 	}

}