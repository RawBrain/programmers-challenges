class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=0; i<=right-left; i++){
            int count =0;
            for(int j=1; j<=left+i; j++){
                if((left+i)%j ==0){
                    count++;
                }
            }
            if(count%2==0){
                answer = answer + left+i;
            }else{
                answer = answer - left-i;
            }
        }
        
        return answer;
    }
}