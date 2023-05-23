class Solution {
    public int solution(int n) {
        int answer = 0;
        int n2 = n+1;
        int n_num = Integer.bitCount(n);
        while(true){
            if( n_num == Integer.bitCount(n2)){
                answer = n2;
                break;
            }
            n2++;
        }
        return answer;
    }
}