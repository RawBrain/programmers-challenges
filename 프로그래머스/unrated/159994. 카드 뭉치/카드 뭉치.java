class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1index=0;
        int c2index=0;
        for(int i=0; i<goal.length; i++){
            if(cards1[c1index].equals(goal[i])){
                if(cards1.length-1 > c1index){
                    c1index++;
                }
            }else if(cards2[c2index].equals(goal[i])){
                if(cards2.length-1 > c2index){
                    c2index++;
                }
            }else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
//about 10mins