class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
        while(index < s.length()){
            String word = s.substring(index,index+1);
            int wcount =1;
            int dwcount =0;
            index++;
            while(wcount !=dwcount){
                if(index>=s.length()){
                    break;
                }
                if(s.substring(index, index+1).equals(word)){
                    wcount++;
                }else{
                    dwcount++;
                }
                index++;
            }
            answer++;
            
        }
        return answer;
    }
}