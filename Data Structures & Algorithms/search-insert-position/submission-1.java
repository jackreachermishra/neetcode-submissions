class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0 ; 
        boolean isTargetFound = false ; 
        while(i < nums.length && nums[i] <= target) {
            if (nums[i] == target) isTargetFound = true ; 
            i++ ; 
        }
        return isTargetFound ? i-1 : i ; 
    }
}