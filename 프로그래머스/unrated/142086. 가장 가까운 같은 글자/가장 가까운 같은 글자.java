class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0; i<s.length(); i++) {
        	int count =1;
        	answer[i] = -1;
        	for(int j=i-1; j>=0; j--) {
            	if(s.substring(i, i+1).equals(s.substring(j, j+1))) {
            		answer[i] = count;
            		break;
            	}
            	count++;
        	}
        }
        return answer;
    }
}