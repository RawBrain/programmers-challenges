class Solution {
    public int[] solution(String s) {
        int change =0;
        int remove =0;
        while(s.length() !=1){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    remove++;
                    s = s.substring(0, i) + s.substring(i+1);
                    i--;
                }
            }
            s = Integer.toString(s.length(), 2);
            change++;
        }
        int[] answer = {change, remove};
        return answer;
    }
}