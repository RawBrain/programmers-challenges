import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                answer.add(i);
                if(i!=n/i){
                    answer.add(n/i);
                }
            }
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}