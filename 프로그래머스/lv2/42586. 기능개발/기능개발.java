import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] done = new int[100];
        int days = (100-progresses[0])/speeds[0];
        if((100-progresses[0])%speeds[0]!=0){
            days++;
        }
        int index = 0;
        boolean next = false;
        for(int i=0; i<progresses.length; i++){
            while(100-progresses[i]>speeds[i]*days){
                days++;
                next = true;
            }
            if(next==true){
                index++;
                next = false;
            }
                done[index]++;
        }
        
        
        return Arrays.stream(done).filter(i -> i!=0).toArray();
    }
}