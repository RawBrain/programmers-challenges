class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        long allPrice =0;
        for(int i=1; i<=count; i++){
            allPrice = allPrice + price*i;
        }
        if(money < allPrice){
            answer = allPrice - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}