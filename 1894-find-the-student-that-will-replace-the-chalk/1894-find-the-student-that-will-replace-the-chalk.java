class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int index = -1;
        long sum = 0;
        for(int i=0;i<chalk.length;i++){
            sum += chalk[i];
        }
        k = (int) (k%sum);
        for(int j=0;j<chalk.length;j++){
            if(chalk[j]>k){
                index = j;
                break;
            }
            else{
                k = k-chalk[j];
            }
        }
        return index;
    }
}