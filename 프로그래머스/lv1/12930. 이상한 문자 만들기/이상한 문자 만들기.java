import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strary = s.split(" ",-1);
        for(int i=0; i<strary.length; i++){
            String[] strary2 = strary[i].split("");
            for(int j=0; j<strary2.length; j++){
            	if(j%2 == 0) {
                    strary2[j] = strary2[j].toUpperCase();
            	}else {
                    strary2[j] = strary2[j].toLowerCase();
            	}
            }
            
            strary[i] = String.join("", strary2);
        }
        answer = String.join(" ",strary);
        
        return answer;
    }
}