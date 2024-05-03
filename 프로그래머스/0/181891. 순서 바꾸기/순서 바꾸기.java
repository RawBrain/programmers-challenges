class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int id =0;
        for(int i=0; i<num_list.length-n; i++){
            answer[id++] = num_list[n+i];
        }
        for(int j=0; j<n; j++){
            answer[id++] = num_list[j];
        }
        return answer;
    }
}