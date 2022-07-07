// QUesiton => https://leetcode.com/problems/maximum-subarray/submissions/
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.max(curr+nums[i], nums[i]);
            max = Math.max(curr,max);
        }
        return max;
    }
}
// Time complexity => O(n)


class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            max = Math.max(sum,max);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
// Time complexity => O(n)
