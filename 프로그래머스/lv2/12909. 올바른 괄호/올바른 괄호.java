class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open =0;
        int close =0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                open++;
            }else {
            	close++;
            }
            if(open-close < 0) {
            	answer = false;
            	break;
            }
        }
        if(open-close!=0) {
        	answer = false;
        }

        return answer;
    }
}