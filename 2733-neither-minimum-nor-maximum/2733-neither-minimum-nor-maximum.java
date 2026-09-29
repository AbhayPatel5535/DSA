class Solution {
    public int findNonMinOrMax(int[] nums) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min && nums[i]!=max){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}