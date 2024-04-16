import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] strarr = my_string.split("");
        String s = strarr[num1];
        strarr[num1] = strarr[num2];
        strarr[num2] = s;
        return String.join("", strarr);
    }
}