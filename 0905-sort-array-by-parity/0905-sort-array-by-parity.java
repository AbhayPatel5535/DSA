class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;
        int oddIndex = nums.length-1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[evenIndex] = nums[i];
                evenIndex++;
            }
            else{
                arr[oddIndex] = nums[i];
                oddIndex--;
            }
        }
        return arr;
    }
}