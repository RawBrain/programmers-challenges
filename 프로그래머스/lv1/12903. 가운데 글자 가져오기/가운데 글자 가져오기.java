class Solution {
    public String solution(String s) {
        String answer = "";
		int index = s.length();
            
        if(index%2 ==0){
            answer = s.substring(index/2-1, index/2+1);
        }else{
            		answer = s.substring(index/2, index/2+1);
        }
        
		        
		return answer;
		    
    }
}