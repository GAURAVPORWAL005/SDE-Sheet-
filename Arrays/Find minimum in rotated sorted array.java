https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// brute force Approach
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}
// time complexity => O(n)

// optimized Approach
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
