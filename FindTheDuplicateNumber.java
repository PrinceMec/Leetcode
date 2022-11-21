class Solution {
    public int findDuplicate(int[] nums) {
        
        
        //Space complexity -> 0(n)
        //Time complexity -> 0(n)
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++) {
            if(set.contains(nums[i]))
                return nums[i];
            
            set.add(nums[i]);
        }
        
        return 0;
    }
}
