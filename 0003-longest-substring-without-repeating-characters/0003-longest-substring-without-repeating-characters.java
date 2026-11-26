class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            left = Math.max(left, arr[c]);
            max = Math.max(max, right - left + 1);
            arr[c] = right + 1;
        }
        return max;
    }
}