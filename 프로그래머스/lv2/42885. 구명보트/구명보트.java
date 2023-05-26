import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lpoint =0;
        int rpoint =people.length-1;
        
        while(lpoint != rpoint+1){
            
            while(lpoint != rpoint){
                if(people[rpoint] + people[lpoint]<=limit){
                    people[rpoint] = people[rpoint] + people[lpoint];
                    lpoint++;
                }else{
                    break;
                }
            }
            rpoint--;
            answer++;
        }
        return answer;
    }
}