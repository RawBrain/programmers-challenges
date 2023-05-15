import java.util.*;
import java.time.*;
import java.time.format.TextStyle;

class Solution {
    public String solution(int a, int b) {
    	
        String answer = "";
        
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
       
        return answer;
    }
}