class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        
        for(int i = 0; i<nums1.length; i++) {
            for(int j = 0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j] && nums1[i] != -1 && nums2[j] != -1) {
                    lst.add(nums1[i]);
                    nums1[i] = -1;
                    nums2[j] = -1;
                }
            }
        }
        
        int[] res = new int[lst.size()];
        int idx = 0;
        for(int i : lst)
            res[idx++] = i;
        
        return res;
    }
    
}
