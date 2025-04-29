package prefixSumDifferenceArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class RangeSumQuery {
	public static int rangeSum(int[] prefixSum, int i, int j) {
        return prefixSum[j] - (i == 0 ? 0 : prefixSum[i - 1]);
    }

    public static LinkedHashMap<String, String> main(String[] args) {
    	LinkedHashMap<String,String> response = new LinkedHashMap<>();
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefixSum = new int[arr.length];

        // Build Prefix Sum
        prefixSum[0] = arr[0];
        for (int k = 1; k < arr.length; k++) {
            prefixSum[k] = prefixSum[k - 1] + arr[k];
        }

        System.out.println("Sum from index 1 to 3: " + rangeSum(prefixSum, 1, 3)); // Output: 18
        response.put("Given Array ", Arrays.toString(arr));
        response.put("PreixSum-Array ", Arrays.toString(prefixSum));
        response.put("Sum from index 1 to 3 ", Integer.toString(rangeSum(prefixSum, 1, 3)));
        return response;
    }
}
