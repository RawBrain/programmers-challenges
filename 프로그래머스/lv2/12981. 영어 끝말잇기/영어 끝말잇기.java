class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int loseword = 0;
        
        findLoser:
        for(int i=0; i<words.length; i++){
            String str = words[i];
            
            if(i>=1 && !str.substring(0,1).equals(words[i-1].substring(words[i-1].length()-1, words[i-1].length()))){ // 단어의 앞 뒤 확인
                loseword =i;
                break;
            }
            
            for(int j=0; j<i; j++){ //단어의 중복 확인
                if(str.equals(words[j])){
                    loseword = i;
                    break findLoser;
                }
            }
        }
        if(loseword == 0){
            return answer;
        }else{
            answer[0] = (loseword+1)%n;
            if(answer[0] ==0){
                answer[0] = n;
            }
            
            answer[1] =loseword/n+1;
        }
        return answer;
    }
}