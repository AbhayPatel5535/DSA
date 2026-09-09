class Solution {
    public int compareBitonicSums(int[] nums) {
        long asum = 0;
        long dsum = 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                asum += nums[i];
                count++;
            }
            else{
                asum += nums[i];
                break;
            }
        }
        for(int j=count;j<nums.length;j++){
            dsum += nums[j];
        }
        if(asum-dsum>0){
            return 0;
        }
        else if(asum-dsum<0){
            return 1;
        }
        return -1;
    }
}