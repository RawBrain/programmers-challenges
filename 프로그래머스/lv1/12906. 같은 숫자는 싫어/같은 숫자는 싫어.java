import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        String s = "";
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]==arr[i]){
                
            }else{
                list.add(arr[i-1]);
            }
        }
        list.add(arr[arr.length-1]);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}