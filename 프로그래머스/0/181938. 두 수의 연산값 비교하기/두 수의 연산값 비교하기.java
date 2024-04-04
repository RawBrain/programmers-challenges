class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        return num1 > a*b*2 ? num1 : a*b*2;
    }
}