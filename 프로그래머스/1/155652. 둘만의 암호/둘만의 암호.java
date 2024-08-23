class Solution {
    public String solution(String s, String skip, int index) {
        char[] box = new char[26 - skip.length()];
        int id = 0;
        StringBuilder answer = new StringBuilder();
        for(char c = 'a'; c <= 'z'; c++){ //skip에 포함된 단어가 제외된 a-z 배열 생성
            if(skip.indexOf(c) == -1){
                box[id++] = c;
            }
        }
        
        
        for(char c1 : s.toCharArray()){
            for(int i=0; i<box.length; i++){
                if(c1==box[i]){
                    id = i;
                    break;
                }
            }
            answer.append(box[(id+index)%box.length]);
        }
        
        return answer.toString();
    }
}