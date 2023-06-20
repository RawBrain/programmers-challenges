class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 1, even = 1;
        
        for(int i=num_list.length-1; i>=0; i--){
            if(num_list[i]%2==0){
                answer = answer + (num_list[i]*even);
                even = even*10;
            }else{
                answer = answer + (num_list[i]*odd);
                odd = odd*10;
            }
        }
        return answer;
    }
}