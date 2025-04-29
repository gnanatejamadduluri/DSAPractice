package subjectServices;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mains.KadanesAlgorithmMaxSubarraySumMain;


@CrossOrigin
@RestController
@RequestMapping("/KadanesAlgorithmMaxSubarraySum")
public class KadanesAlgorithmMaxSubarraySumMainServices {

	 @GetMapping("/KadanesAlgorithm")
	 public Map<String, String> getKadanesAlgorithm() {
		 Map<String, String> response = KadanesAlgorithmMaxSubarraySumMain.KA.main(null);
		 return response;
	    }
	 
	 @GetMapping("/KadanesWithIndices")
	 public Map<String, String> getKadanesWithIndices() {
		 Map<String, String> response = KadanesAlgorithmMaxSubarraySumMain.KAI.main(null);
		 return response;
	    }
	
	 @GetMapping("/CircularKadaneWithSubarray")
	 public Map<String, String> getCircularKadaneWithSubarray() {
		 Map<String, String> response = KadanesAlgorithmMaxSubarraySumMain.CKWS.main(null);
		 return response;
	 	}

	 @GetMapping("/CircularKadaneWithIndices")
	 public Map<String, String> getCircularKadaneWithIndices() {
		 Map<String, String> response = KadanesAlgorithmMaxSubarraySumMain.CKWI.main(null);
		 return response;
	 	}
	 @GetMapping("/CircularKadanes")
	 public Map<String, String> getCircularKadanes() {
		 Map<String, String> response = KadanesAlgorithmMaxSubarraySumMain.CK.main(null);
		 return response;
	    }
}
