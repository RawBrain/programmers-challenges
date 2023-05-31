class Solution {
    public int solution(String myString, String pat) {
        int answer = 1;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if(myString.length() == myString.replaceAll(pat, "").length()){
            answer =0;
        }
        return answer;
    }
}