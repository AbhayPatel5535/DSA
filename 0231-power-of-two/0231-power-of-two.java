class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag = false;
        if(n==1){
            return true;
        }
        for(int i=1;i<n;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
            else if(Math.pow(2,i)>n){
                flag = false;
                break;
            }
        }
        return flag;
    }
}