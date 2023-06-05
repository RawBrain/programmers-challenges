import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        String[][] buy = new String[want.length][2];
        boolean ca = true;
        for(int i=0; i<want.length; i++){
            buy[i][0] = want[i];
            buy[i][1] = Integer.toString(number[i]);
        }
        
        for(int i=0; i<10; i++){
            for(int j=0; j<want.length; j++){
                if(discount[i].equals(buy[j][0])){
                    buy[j][1] = Integer.toString(Integer.parseInt(buy[j][1])-1);
                }
            }
        }
        for(int i=0; i<want.length; i++){
            if(Integer.parseInt(buy[i][1]) >0){
                ca = false;
            }
        }
        if(ca == true){
            answer++;
        }
        
        for(int i=10; i<discount.length; i++){
            ca = true;
            for(int j=0; j<want.length; j++){
                if(discount[i-10].equals(buy[j][0])){
                    buy[j][1] = Integer.toString(Integer.parseInt(buy[j][1])+1);
                }
            }
            for(int j=0; j<want.length; j++){
                if(discount[i].equals(buy[j][0])){
                    buy[j][1] = Integer.toString(Integer.parseInt(buy[j][1])-1);
                }
            }
            for(int j=0; j<want.length; j++){
                if(Integer.parseInt(buy[j][1]) >0){
                    ca = false;
                }
            }
            if(ca == true){
                answer++;
            }
        }
        
        
        return answer;
    }
}