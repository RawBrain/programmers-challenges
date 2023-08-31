import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int people = stages.length;
        int[] answer = new int[N];
        double[][] lose = new double[N][2];
        
        for(int i=0; i<stages.length; i++){
            if(stages[i]-1 ==N){
                continue;
            }
            answer[stages[i]-1]++;
        }
        
        for(int j=0; j<lose.length; j++){
            lose[j][0] = -(double)answer[j]/(double)people;
            lose[j][1] = (double)j;
            people = people - answer[j];
        }
        
        Arrays.sort(lose, Comparator.comparingDouble(o1 -> o1[0]));
        for(int k=0; k<answer.length; k++){
            answer[k] = (int)lose[k][1]+1;
        }
        
        return answer;
    }
}