import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "";
		str = Long.toString(n);
		
		String[] strary = str.split("");
		

		Arrays.sort(strary, Collections.reverseOrder());
        
        str = Arrays.stream(strary).collect(Collectors.joining());
        answer = Long.parseLong(str);
        return answer;
    }
}