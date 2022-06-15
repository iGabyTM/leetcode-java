package median_of_two_sorted_arrays;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/723217533/">Submission</a>
 */
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final var m = nums1.length;
        final var n = nums2.length;

        if (m == 0 && n == 1) {
            return nums2[0];
        }

        if (m == 1 && n == 0) {
            return nums1[0];
        }

        final var length = m + n;
        final var result = new int[length];

        var i = 0;
        var j = 0;
        var k = 0;

        while (i < m && j < n) {
            result[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }

        // add the remaining numbers from the first array
        while (i < m) {
            result[k++] = nums1[i++];
        }

        // add the remaining numbers from the second array
        while (j < n) {
            result[k++] = nums2[j++];
        }

        final var center = (length % 2 == 0) ? length / 2 : (length - 1) / 2;
        return (length % 2 == 0) ? (result[center - 1] + result[center]) / 2d : result[1];
    }

}
