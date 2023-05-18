import java.util.*;
class Solution {
   	public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            boolean sayyes = true;
            int index =0;
            int bwindex = 4;
            while(true){
                try{
                if(bwindex != 0 && babbling[i].substring(index, index+1).equals("a")){
                    if(babbling[i].substring(index, index+3).equals("aya")==false){
                        sayyes = false;
                        break;
                    }
                    bwindex = 0;
                    index = index + 3;
                    
                    if(index == babbling[i].length()){
                        break;
                    }
                }else if(bwindex != 1 && babbling[i].substring(index, index+1).equals("y")){
                    if(babbling[i].substring(index, index+2).equals("ye")==false){
                        sayyes = false;
                        break;
                    }
                    bwindex = 1;
                    index = index + 2;
                    
                    if(index == babbling[i].length()){
                        break;
                    }
                }else if(bwindex != 2 && babbling[i].substring(index, index+1).equals("w")){
                    if(babbling[i].substring(index, index+3).equals("woo")==false){
                        sayyes = false;
                        break;
                    }
                    bwindex = 2;
                    index = index + 3;
                    
                    if(index == babbling[i].length()){
                        break;
                    }
                }else if(bwindex != 3 && babbling[i].substring(index, index+1).equals("m")){
                    if(babbling[i].substring(index, index+2).equals("ma")==false){
                        sayyes = false;
                        break;
                    }
                    bwindex = 3;
                    index = index + 2;
                    
                    if(index == babbling[i].length()){
                        break;
                    }
                }else{
                    sayyes = false;
                    break;
                }
                }catch(Exception ex){
                    sayyes = false;
                    break;
                }
            }
            if(sayyes == true){
                answer++;
            }
        }
        return answer;
    }
}