class Solution {
    public int solution(int hp) {
        int count = 0;
        while(hp>0){
            if(hp>=5){
                hp = hp-5;
                count++;
            }else if(hp>=3){
                hp = hp-3;
                count++;
            }else{
                hp = hp-1;
                count++;
            }
        }
        return count;
    }
}