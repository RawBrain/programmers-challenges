import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = citations.length;
        
        loop:
        for(int i=citations[citations.length-1]; i>=0; i--){
            int count = 0;
            
            for(int j=citations.length-1; j>=0; j--){
                if(i<=citations[j]){
                    count++;
                }else{
                    break;
                }
                
                if(count >= i){
                    answer = i;
                    break loop;
                }
            }
        }
        
        return answer;
    }
}