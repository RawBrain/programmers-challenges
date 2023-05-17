import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[(numbers.length*(numbers.length-1))/2];
        int count = 0;
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer[count] = numbers[i]+numbers[j];
                count++;
            }
        }
        
        answer = Arrays.stream(answer).distinct().toArray();
        Arrays.sort(answer);
        return answer;
    }
}
//about 20mins