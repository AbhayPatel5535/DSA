class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean flag = true;
        int oddMin = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==1 && nums1[i]<=oddMin){
                oddMin = nums1[i];
            }
        }
    if(oddMin!=Integer.MAX_VALUE){
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0 && nums1[i]<=oddMin){
                flag = false;
            }
        }
    }
        return flag;
    }
}