class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<=9; i++){
            boolean in = true;            
            for(int j=0; j<numbers.length; j++){
                if(i == numbers[j]){
                    in = false;
                    break;
                }
            }
            if(in == true){
                answer = answer + i;
            }
        }
        return answer;
    }
}