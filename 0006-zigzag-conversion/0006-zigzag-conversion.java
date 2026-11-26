class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder ans = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for (int r = 0; r < numRows; r++) {
            for (int i = r; i < s.length(); i += cycle) {
                ans.append(s.charAt(i));

                int j = i + cycle - 2 * r;
                if (r != 0 && r != numRows - 1 && j < s.length())
                    ans.append(s.charAt(j));
            }
        }
        return ans.toString();
    }
}