class Solution {
    public int solution(String my_string){
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++){
            try{
                answer +=Integer.parseInt(my_string.substring(i,i+1));
            }catch(NumberFormatException ex){}
        }
        return answer;
    }
}