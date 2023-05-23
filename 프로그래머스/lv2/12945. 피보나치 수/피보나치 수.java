class Solution {
    public long solution(int n) {
        long answer = 0;
        long sum =1;
        long bfn =0;
        long num =0;
        for(int i=1; i<n; i++){
            num = sum%1234567;
            sum = (sum  + bfn)%1234567;
            bfn = num%1234567;
        }
        answer = sum;
        return answer;
    }
}