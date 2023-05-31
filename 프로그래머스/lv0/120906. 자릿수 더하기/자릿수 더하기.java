class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        String[] strarr = s.split("");
        for(int i =0; i<strarr.length; i++){
            answer = answer + Integer.parseInt(strarr[i]);
        }
        return answer;
    }
}