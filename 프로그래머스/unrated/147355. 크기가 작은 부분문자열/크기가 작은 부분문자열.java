import java.util.*;

class Solution {
    public int solution(String t, String p) {
		int answer = 0;
		String str = "";
        try{
            for(int i = 0; i<t.length()-p.length()+1 ; i++){
                str = t.substring(i, p.length()+i);
                if(Long.parseLong(str) <= Long.parseLong(p)) {
                    answer++;
                }
            }
        }catch (NumberFormatException ex){
        }
        
        return answer;
    }
}