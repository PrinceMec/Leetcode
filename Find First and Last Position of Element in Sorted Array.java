class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length == 1 && target == nums[0])
            return new int[]{0, 0};
        
       
        int firstIndex = -1, lastIndex = -1;
        
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == target) {
                firstIndex = i;
                break;
            }
        }
        
        for(int i = nums.length - 1; i>=0; i--) {
            if(nums[i] == target) {
                lastIndex = i;
                break;
            }
        }
        
        return new int[]{firstIndex, lastIndex};
    }
}
