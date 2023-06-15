class Solution {
    public int[] solution(int[] num_list) {
        int nl = num_list.length;
        int[] answer = new int[nl+1];
        
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        answer[nl] = num_list[nl-1] > num_list[nl-2] ? num_list[nl-1]-num_list[nl-2] : num_list[nl-1]*2;
        
        return answer;
    }
}