class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int h=1; h<=yellow; h++){
            if(yellow%h==0){
                int w = yellow/h;
                if((h*2)+(w*2)+4 == brown){
                    answer[0] = h+2;
                    answer[1] = w+2;
                }
            }
        }
        return answer;
    }
}