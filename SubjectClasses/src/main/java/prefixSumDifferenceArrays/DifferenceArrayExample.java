package prefixSumDifferenceArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class DifferenceArrayExample {
	public static LinkedHashMap<String, String> main(String[] args) {
		LinkedHashMap<String,String> response = new LinkedHashMap<>();
        int[] arr = {2, 4, 6, 8, 10};
        int[] diff = new int[arr.length + 1]; // One extra space to avoid out of bounds

        // Initialize the difference array
        for (int i = 0; i < arr.length; i++) {
            diff[i] = arr[i] - (i == 0 ? 0 : arr[i - 1]);
        }

        // Range update from index 1 to 3 by adding 5
        rangeUpdate(diff, 1, 3, 5);

        // Reconstruct the array after updates
        int[] updatedArray = new int[arr.length];
        updatedArray[0] = diff[0];

        for (int i = 1; i < arr.length; i++) {
            updatedArray[i] = updatedArray[i - 1] + diff[i];
        }

        // Print the updated array
        for (int num : updatedArray) {
            System.out.print(num + " ");
        }
        
        response.put("Given Array ", Arrays.toString(arr));
        response.put("Range update from index 1 to 3 ", "by adding 5");
        response.put("Updated Array", Arrays.toString(updatedArray));
        return response;
    }

    // Function for range update
    public static void rangeUpdate(int[] diff, int l, int r, int val) {
        diff[l] += val;
        if (r + 1 < diff.length) {
            diff[r + 1] -= val;
        }
    }
}
