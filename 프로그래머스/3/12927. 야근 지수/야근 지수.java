import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        works = Arrays.copyOf(works, works.length + 1);
        Arrays.sort(works);
        int wlen = works.length;
        int sum = 0;
        int i=0;
        
        for(i=1; i<wlen; i++){
            long diff = (works[wlen-i] - works[wlen-i-1])*i;
            
            if(n-sum-diff < 0){
                long a1=(n-sum)/i;
                long a2=(n-sum)%i;
                answer += (i-a2)*(works[wlen-i]-a1)*(works[wlen-i]-a1);
                answer += a2*(works[wlen-i]-a1-1)*(works[wlen-i]-a1-1);
                break;
            }
            sum += diff;
        }
        if(i==wlen){
            return 0;
        }
        for(int j=0; j<wlen-i; j++){
            answer += works[j]*works[j];
        }
        return answer;
    }
}