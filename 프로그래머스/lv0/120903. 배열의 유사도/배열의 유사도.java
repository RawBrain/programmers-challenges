import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0; i<s1.length; i++){
            for(String j : s2){
                if(s1[i].equals(j)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}