import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        for(int i = 0; i<sArray.length; i++) {
        	answer = answer + sArray[sArray.length-i-1];
        }
        return answer;
    }
}