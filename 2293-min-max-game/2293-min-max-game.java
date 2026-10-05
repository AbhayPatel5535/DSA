class Solution {
    static int value=0;
    static void print(int nums[]) {
        if (nums.length == 1) {
            value = nums[0];
            return;
        }
        int count = 0;
        int arr[]=new int[(nums.length/2)];
        for (int i = 0; i < nums.length; i++) {
            if (count % 2 == 0) {
                arr[count++] = Math.min(nums[i], nums[++i]);
            } else {
                arr[count++] = Math.max(nums[i], nums[++i]);
            }
        }
        print(arr);
    }

    public int minMaxGame(int[] arr) {
        value=0;
        print(arr);
        return value;
    }
}