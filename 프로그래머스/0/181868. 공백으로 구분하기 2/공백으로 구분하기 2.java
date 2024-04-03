import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        return Arrays.stream(my_string.split(" ", 0)).filter(value -> !value.equals("")).toArray(String[]::new);
    }
}