class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int index = -1;
        for(int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max = Math.max(max, nums[j]);
            }
            for(int x=i;x<nums.length;x++){
                min = Math.min(min, nums[x]);
            }
            if(max-min <= k){
                index = i;
                break;
            }
        }
        return index;
    }
}