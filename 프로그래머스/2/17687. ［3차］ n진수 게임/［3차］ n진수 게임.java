import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        boolean full = false;
        int i = 0;
        String num = "";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        while(full == false){
            num = Integer.toString(i++, n);
            for(int j=0; j<num.length(); j++){
                if(count%m+1==p){
                    sb.append(num.charAt(j));
                    t--;
                }
                if(t==0){
                    full= true;
                    break;
                }
                count++;
            }
            
        }
        return sb.toString().toUpperCase();
    }
}