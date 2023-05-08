class Solution {
    public int[] solution(long n) {
        int[] answer;
        String[] strarr = Long.toString(n).split("");
        answer = new int[strarr.length];
        
        for(int i = 0; i<strarr.length; i++){
            answer[i] = Integer.valueOf(strarr[strarr.length-i-1]);
        }
                return answer;
    }
}