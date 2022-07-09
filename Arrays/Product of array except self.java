
// brute froce approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                product *= nums[j];
            }
               ans[i] = product;
        }
        return ans;
    }
}
// time complexity => O(n2)

// optimized  approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pre  = new int[n];
        int[] suff = new int[n];
         pre[0] = 1;
         suff[n-1] = 1;
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suff[i] = suff[i+1] * nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }
}
// time complexity => O(n)
// space complexity => O(n)
