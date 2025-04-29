package subjectServices;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mains.SlidingWindowMain;

@CrossOrigin
@RestController
@RequestMapping("/SlidingWindow")
public class SlidingWindowServices {
	
	 @GetMapping("/BruteForceMaxSum")
	 public Map<String, String> getBruteForceMaxSum() {
		 Map<String, String> response = SlidingWindowMain.BFM.main(null);
		 return response;
	    }
	 
	 @GetMapping("/SlidingWindowMaxSum")
	 public Map<String, String> getSlidingWindowMaxSum() {
		 Map<String, String> response = SlidingWindowMain.SWMS.main(null);
		 return response;
	    }
	 
	 @GetMapping("/SlidingWindowMinSubarray")
	 public Map<String, String> getSlidingWindowMinSubarray() {
		 Map<String, String> response = SlidingWindowMain.SWMSub.main(null);
		 return response;
	    }
}
