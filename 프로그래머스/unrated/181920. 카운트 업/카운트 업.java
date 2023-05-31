class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int index =0;
        while(start !=end+1){
            answer[index] = start;
            start++;
            index++;
        }
        return answer;
    }
}