import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(double i=1; i<=number; i++){
            double num =Math.sqrt((double)i);
            int count =0;
            
            for(int j =1; j<=num; j++){
                if(i%j == 0){
                    count = count +2;
                }
            }
            if(i % num ==0){
                count--;
            }
            if(count>limit){
                answer = answer + power;
            }else{
                answer = answer + count;
            }
        }
    return answer;
    }
}