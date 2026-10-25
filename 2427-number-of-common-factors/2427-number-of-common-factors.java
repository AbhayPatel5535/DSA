class Solution {
    public int commonFactors(int a, int b) {
        ArrayList <Integer> fact1 = new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                fact1.add(i);
            }
        }
        ArrayList <Integer> fact2 = new ArrayList<>();
        for(int i=1;i<=b;i++){
            if(b%i==0){
                fact2.add(i);
            }
        }
        int count = 0;
        for(int i=0;i<fact1.size();i++){
            for(int j=0;j<fact2.size();j++){
                if(fact1.get(i).equals(fact2.get(j))){
                    count++;
                }
            }
        }
        return count;
    }
}