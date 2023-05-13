import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }else{
            int[] answer = new int[arr.length-1];
            int[] arr2 = Arrays.copyOf(arr, arr.length);
            Arrays.sort(arr2);
            
            int n = arr2[0];
            int count = 0;
        
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != n) {
                    answer[count] = arr[i];
                    count++;
                }
            }
            return answer;
        }
    }
}