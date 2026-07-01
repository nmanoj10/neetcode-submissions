class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int low = 0; low < nums.length; low++) {
            for (int high = low + 1; high < nums.length; high++) {
                if (nums[low] + nums[high] == target) {
                    return new int[]{low, high};
                }
            }
        }
        return new int[]{-1, -1};
    }
}