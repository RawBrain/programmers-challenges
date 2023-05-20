import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder("");
        int[] arr = new int[10];
        String answer = "";
        
        for(int i =0; i<Y.length(); i++) {
            int n= Y.charAt(i)-48;
            arr[n]++;
        }
        
        int zero = arr[0];
        
        for(int i =0; i<X.length(); i++) {
            int n = X.charAt(i)-48;
        	if(arr[n]>0) {
            	arr[n]--;
            	sb.append(n);
        	}
        }
        
        answer = sb.toString();
        
        if(answer.equals("")){
            return "-1";
        }
        if(answer.length()==zero){
            return "0";
        }
        
        String[] str = answer.split("");
        Arrays.sort(str);
        answer = String.join("",str);
        StringBuilder sb2 = new StringBuilder(answer);
        answer = sb2.reverse().toString();
        return answer;
    }
}