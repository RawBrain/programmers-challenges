class Solution {
    public int[] solution(String myString) {
        String[] strarr = myString.split("x", -1);
        int[] answer = new int[strarr.length];
        
        for(int i=0; i<strarr.length; i++){
            answer[i] = strarr[i].length();
        }
        
        return answer;
    }
    
    
}