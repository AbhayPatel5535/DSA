class Solution {
    public boolean checkString(String s) {
        boolean flag = true;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='a' && s.charAt(i-1)=='b'){
                flag = false;
            }
        }
        return flag;
    }
}