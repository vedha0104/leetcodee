class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int a=0; a < nums.length; a++){
            for(int b = a+1; b < nums.length;b++)
            {
                if(nums[b] == target - nums[a]){
                    return new int[] {a,b};
                }
            }
        }
        return new int[] {};
        
    }
}