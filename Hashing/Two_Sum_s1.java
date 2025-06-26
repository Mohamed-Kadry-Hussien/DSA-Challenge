//https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=plakya4j&
//Solution_1 Time complexity o(n) 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>(); 
     for(int i=0 ; i<nums.length ;i++)
     {
        int diff = target - nums[i];
        if(map.containsKey(diff))
        {
            return new int[]{map.get(diff) , i};
        }
        map.put(nums[i],i);
     } 
     return new int [] {};  
    }
}
