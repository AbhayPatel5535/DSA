class Solution {
    public boolean isPowerOfThree(int n) {
        boolean flag = false;
        if(n==1 || n==3){
            return true;
        }
        for(int i=1;i<n/2;i++){
            if(Math.pow(3,i)==n){
                return true;
            }
            else if(Math.pow(3,i)>n){
                flag = false;
                break;
            }
        }
        return flag;
    }
}