class Solution {
    public int heightChecker(int[] heights) {
        int[] orig = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            orig[i] = heights[i];
        }
        int count = 0;
        Arrays.sort(heights);
        for(int i=0;i<orig.length;i++){
            if(orig[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}