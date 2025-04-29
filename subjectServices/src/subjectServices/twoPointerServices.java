package subjectServices;
import java.util.HashMap;
import java.util.Map;
import mains.TwoPointerMain;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/twoPointer")
public class twoPointerServices {
	 @GetMapping("/MergeSortedArrays")
	 public Map<String, String> getMergeSortedArrays() {
		 Map<String, String> response = TwoPointerMain.MSA.main(null);
		 return response;
	    }
	 
	 @GetMapping("/PalindromeChecker")
	 public Map<String, String> getPalindromeChecker() {
		 Map<String, String> response = TwoPointerMain.PDC.main(null);
		 return response;
	    }
	
	 @GetMapping("/TwoSumSorted")
	 public Map<String, String> getTwoSumSorted() {
		 Map<String, String> response = TwoPointerMain.TSS.main(null);
		 return response;
	 	}

	 @GetMapping("/RemoveDuplicates")
	 public Map<String, String> getRemoveDuplicates() {
		 Map<String, String> response = TwoPointerMain.RDP.main(null);
		 return response;
	 	}

}
