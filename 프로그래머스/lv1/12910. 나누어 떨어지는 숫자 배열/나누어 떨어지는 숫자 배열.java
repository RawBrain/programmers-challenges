import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%divisor ==0){
                arr[count] = arr[i];
                count++;
            }
        }
        if(count == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[count];  
        }
        
        
        for(int j = 0; j<count; j++){
            answer[j] = arr[j];
        }

        Arrays.sort(answer);
        return answer;
    }
}