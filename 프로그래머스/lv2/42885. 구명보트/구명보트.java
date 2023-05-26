import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int lpoint =0;
        int rpoint =people.length-1;
        
        Arrays.sort(people);

        while(lpoint <= rpoint){
            if(people[rpoint] + people[lpoint]<=limit){
                lpoint++;
            }
            rpoint--;
            answer++;
        }
        return answer;
    }
}