import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] n = Arrays.stream(nums).distinct().toArray();
        
        if(n.length >= nums.length/2){
            answer = nums.length/2;
        }else{
            answer = n.length;
        }
        return answer;
    }
}