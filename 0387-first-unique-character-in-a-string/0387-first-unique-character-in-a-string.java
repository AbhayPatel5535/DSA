class Solution {
    public int firstUniqChar(String s) {
        for( char ch : s.toCharArray()){
            int firstIndex = s.indexOf(ch);
            int lastIndex = s.lastIndexOf(ch);
            if(firstIndex==lastIndex){
                return firstIndex;
            }
        }
        return -1;
    }
}