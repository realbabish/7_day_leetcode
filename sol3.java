/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 */


import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;

        int[] combinedArray = new int[totalLen];
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length);

        Arrays.sort(combinedArray);

        int middleIndex = totalLen / 2;
        if (totalLen % 2 == 0) {
            double median = (combinedArray[middleIndex - 1] + combinedArray[middleIndex]) / 2.0;
            return median;
        } else {
            return combinedArray[middleIndex];
        }
    }
}
