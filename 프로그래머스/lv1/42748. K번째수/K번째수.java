import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int icount =0;
            int[] arr = new int[commands[i][1]-commands[i][0]+1];
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                arr[icount] = array[j];
                icount++;
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}
//about 15mins