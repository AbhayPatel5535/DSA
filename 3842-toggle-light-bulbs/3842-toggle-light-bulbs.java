class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] state = new int[101];
        List<Integer> rez = new ArrayList<>();
        for (int b : bulbs) {
            state[b] ^= 1;
        }
        for (int i = 1; i < 101; i++) {
            if (state[i] == 1) {
                rez.add(i);
            }
        }
        return rez;
    }
}