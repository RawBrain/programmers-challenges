import java.util.*;
class Solution {
    public Integer[] solution(String my_string){
        String[] answer = my_string.replaceAll("[^0-9]+", "").split("");
        Arrays.sort(answer);
        return Arrays.stream(answer).map(Integer::parseInt).toArray(Integer[]::new);
    }
}