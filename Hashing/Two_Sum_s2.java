//https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=plakya4j&
//Solution_2 Time complexity o(n^2) Brute Force 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < len; j++) {
                if (diff == nums[j]) {
                    return new int[] { i, j };
                }
            }
        }
    return new int [] {-1,-1};
    }
}