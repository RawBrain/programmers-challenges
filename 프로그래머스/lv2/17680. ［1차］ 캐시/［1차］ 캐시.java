import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize==0){
            return cities.length*5;
        }
        
        Queue<String> cque = new LinkedList<>();
        
        for(int i=0; i<cities.length; i++){
            if(cque.contains(cities[i].toLowerCase())){
                cque.remove(cities[i].toLowerCase());
                cque.add(cities[i].toLowerCase());
                answer++;
            }else{
                if(cque.size()>=cacheSize){
                    cque.poll();
                }                
                cque.add(cities[i].toLowerCase());
                answer+=5;
            }
        }
        return answer;
    }
}