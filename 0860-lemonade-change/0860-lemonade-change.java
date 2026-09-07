class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean flag = true;
        int count5 = 0;
        int count10 = 0;
        int count20 = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
            }
            else if(bills[i]==10 && count5!=0){
                count5--;
                count10++;
            }
            else if(bills[i]==10 && count5==0){
                flag = false;
                count10++;
            }
            else if(bills[i]==20 && count5>=3 || count5!=0 && count10!=0){
                if(count10!=0 && count5!=0){
                    count5--;
                    count10--;
                    count20++;
                }
                else if(count5>=3) count5 -= 3;
            }
            else{
                flag = false;
            }
        }
        return flag;
    }
}