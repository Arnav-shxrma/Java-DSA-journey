class Solution {
    public int[] getConcatenation(int[] nums) {

        int x = nums.length;
        int y = x * 2;

        int[] result = new int[y];

        for (int i = 0; i < y; i++) {
            result[i] = nums[i % x];
        }

        return result;
    }
}
