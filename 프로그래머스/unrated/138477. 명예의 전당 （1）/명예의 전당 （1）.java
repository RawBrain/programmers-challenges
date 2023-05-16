import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[k];
        int min = 0;
        for(int i=0; i<score.length; i++){
            if(i>=k && min<score[i]){
                rank[0] = score[i];
                Arrays.sort(rank);
                min = rank[0];
            }else if(i<k){
                rank[0] = score[i];
                Arrays.sort(rank);
                min = rank[k-i-1];
            }
            answer[i] = min;
        }
        
        return answer;
    }
}