class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int dif = Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            dif = Math.max(dif, Math.abs(nums[i]-nums[i+1]));
        }
        return dif;
    }
}