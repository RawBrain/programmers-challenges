class Solution {
    public int solution(double n) {
        return Math.sqrt(n)%1 == 0 ? 1 : 2;
    }
}