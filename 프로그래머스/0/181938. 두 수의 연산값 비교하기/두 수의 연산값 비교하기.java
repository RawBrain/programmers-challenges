class Solution {
    public int solution(int a, int b) {
        return Integer.parseInt(""+a+b) > a*b*2 ? Integer.parseInt(""+a+b) : a*b*2;
    }
}