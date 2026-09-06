class Solution {
    public int maxOperations(int[] nums) {
        int count = 0;
        if(nums.length==2){
            count = 1;
        }
        else{
        for(int i=0;i<nums.length-1;i+=2){
            int start = nums[0] + nums[1];
            if(nums[i] + nums[i+1] == start){
                count++;
            }
            else{
                break;
            }
        }
        }
        return count;
    }
}