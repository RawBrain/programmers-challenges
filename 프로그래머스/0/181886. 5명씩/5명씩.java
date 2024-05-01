import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] strarr = new String[names.length/5 + (names.length%5 !=0 ? 1 : 0)];
        for(int i=0; i<strarr.length; i++){
            strarr[i] = names[i*5];
        }
        
        return strarr;
    }
}