import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] nps = new int[10000001];
        for(int i=0; i<tangerine.length; i++){
            nps[tangerine[i]]++;
        }
        Arrays.sort(nps);
        int i=1;
        while(k>0){
            k = k-nps[nps.length-i];
            i++;
            answer++;
        }        
        
        return answer;
    }
}