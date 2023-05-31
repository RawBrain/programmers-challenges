class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i =0; i<control.length(); i++){
            String num = control.substring(i,i+1);
            if(num.equals("w")){
                n = n+1;
            }else if(num.equals("s")){
                n = n-1;
            }else if(num.equals("d")){
                n = n+10;
            }else{
                n = n-10;
            }
        }
        answer = n;
        return answer;
    }
}