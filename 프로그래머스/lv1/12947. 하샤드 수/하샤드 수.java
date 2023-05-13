class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] strary = Integer.toString(x).split("");
        for(int i=0; i<strary.length; i++) {
            sum = sum + Integer.parseInt(strary[i]);
        }
        if(x%sum!=0) {
            answer =false;
        }
        
        return answer;
    }
}