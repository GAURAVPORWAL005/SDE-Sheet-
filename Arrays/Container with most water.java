https://leetcode.com/problems/container-with-most-water/
// brute force appraoch
class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int max = 0;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                int area = Math.min(height[i], height[j]) * (j-i);
                max = Math.max(max,area);
            }
        }
        return max;
    }
}
// time complexity => O(n2)

// optimized approach
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left < right){
            max = Math.max(max,Math.min(height[left],height[right]) * (right-left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
// time complexity => O(n)
