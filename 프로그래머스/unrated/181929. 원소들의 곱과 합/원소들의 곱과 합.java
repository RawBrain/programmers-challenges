class Solution {
    public int solution(int[] num_list) {
        int sum =0, mul=1;
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            sum = sum + num_list[i];
            mul = mul * num_list[i];
        }
        sum = sum*sum;
        if(mul < sum){
            answer = 1;
        }
        return answer;
    }
}