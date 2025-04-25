package prefixSumDifferenceArrays;

public class RangeSumQuery {
	public static int rangeSum(int[] prefixSum, int i, int j) {
        return prefixSum[j] - (i == 0 ? 0 : prefixSum[i - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefixSum = new int[arr.length];

        // Build Prefix Sum
        prefixSum[0] = arr[0];
        for (int k = 1; k < arr.length; k++) {
            prefixSum[k] = prefixSum[k - 1] + arr[k];
        }

        System.out.println("Sum from index 1 to 3: " + rangeSum(prefixSum, 1, 3)); // Output: 18
    }
}
