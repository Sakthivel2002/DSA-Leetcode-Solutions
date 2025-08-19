//This is my brute force solution which has O(n^2) Time complexity and O(1) Space complexity.
//For optimized solution we can use HashMap with O(n) Time and O(n) Space complexities.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        } return new int[] {};
    }
}
