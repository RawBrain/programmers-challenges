import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strarr = new String[my_string.length()*n];
        int index = 0;        
        
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                strarr[index] = my_string.substring(i,i+1);
                index++;
            }
        }
        answer = String.join("",strarr);
        
        return answer;
    }
}