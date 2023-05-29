import java.util.*;
class Solution {
    public int solution (String s){
        int answer = 0;
        String[] strarr = s.split("");
        for(int i=0; i<strarr.length; i++){
            int a =0, b=0, c=0;
            boolean wr = false;
            int count =0;
            int j = i;
            while(count != strarr.length){
                if(j == strarr.length){
                    j=0;
                }
                if(strarr[j].equals("(")){
                    a++;
                }else if(strarr[j].equals(")") && a > 0){
                    a--;
                }else if(strarr[j].equals("[")){
                    b++;
                }else if(strarr[j].equals("]") && b > 0){
                    b--;
                }else if(strarr[j].equals("{")){
                    c++;
                }else if(strarr[j].equals("}") && c > 0){
                    c--;
                }else{
                    wr = true;
                    break;
                }
                count++;
                j++;
            }
            if(wr == false && a==0 && b==0 && c==0){
                answer++;
            }
        }
        if(strarr[0].equals("(")&&strarr[1].equals("[")){ // sibal
            answer = 0;
        }
        return answer;
    }
}