class Solution {
    public boolean isPowerOfFour(int n) {
        boolean flag = false;
        if(n==1){
            return true;
        }
        for(int i=1;i<n/2;i++){
            if(Math.pow(4,i)==n){
                flag = true;
                return flag;
            }
            else if(Math.pow(4,i)>n){
                flag = false;
                break;
            }
        }
        return flag;
    }
}