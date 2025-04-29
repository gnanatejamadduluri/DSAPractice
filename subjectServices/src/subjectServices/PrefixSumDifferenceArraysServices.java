package subjectServices;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prefixSumDifferenceArrays.DifferenceArrayExample;
import prefixSumDifferenceArrays.PrefixSumExample;
import prefixSumDifferenceArrays.RangeSumQuery;

@CrossOrigin
@RestController
@RequestMapping("/PrefixSumDifferenceArrays")
public class PrefixSumDifferenceArraysServices {
	 @GetMapping("/DifferenceArrayExample")
	 public Map<String, String> getDifferenceArrayExample() {
		 Map<String, String> response = DifferenceArrayExample.main(null);
		 return response;
	    }
	 
	 @GetMapping("/PrefixSumExample")
	 public Map<String, String> getPrefixSumExample() {
		 Map<String, String> response = PrefixSumExample.main(null);
		 return response;
	    }
	 
	 @GetMapping("/RangeSumQuery")
	 public Map<String, String> getRangeSumQuery() {
		 Map<String, String> response = RangeSumQuery.main(null);
		 return response;
	    }

}
