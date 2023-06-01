import java.util.*;
class Solution {
	public long[] solution(int n, long left, long right) {
        int arrsize = (int)right-(int)left+1;
        long[] answer = new long[arrsize];
        List<Integer> list = new ArrayList<>();
        long count =0;
        
        for(int i=1; i<=n; i++){
            if(count+n<left){
                count+=n;
                continue;
            }
            for(int j=0; j<i; j++){
                if(list.size()>=arrsize){
                    break;
                }
                if(count<left){
                    count++;
                    continue;
                }
                list.add(i);
            }
            
            for(int k=i+1; k<=n; k++){
                if(list.size()>=arrsize){
                    break;
                }
                if(count<left){
                    count++;
                    continue;
                }
                list.add(k);
            }
        }
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
            left++;
        }
        
        return answer;
    }
}