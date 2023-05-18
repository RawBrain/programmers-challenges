class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        for(int i =0; i<lottos.length; i++){
            if(lottos[i] ==0){
                answer[0]++;
            }else{
                boolean win = false;
                for(int j : win_nums){
                    if(lottos[i] == j){
                        win = true;
                    }
                }
                if(win ==true){
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        for(int i=0; i<2; i++){
            answer[i] = 7-answer[i];
            if(answer[i]>6){
                answer[i] = 6;
            }
        }
        return answer;
    }
}