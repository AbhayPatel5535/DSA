class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    int count = numBottles;
    while(numBottles>=numExchange){
       int newBottle = numBottles/numExchange;
       count = count + newBottle;
       numBottles = numBottles % numExchange + newBottle;
    }
    return count;   
    }
}