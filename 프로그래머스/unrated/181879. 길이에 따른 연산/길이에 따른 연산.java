class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int nl = num_list.length;
        if(nl <=10 ){
            answer = 1;
        }
        for(int i=0; i<nl; i++){
            if(nl >= 11){
                answer = answer + num_list[i];
            }else{
                answer = answer * num_list[i];
            }
        }
        return answer;
    }
}