import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> nlist = new ArrayList<Integer>();
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                nlist.add(numlist[i]);
            }
        }
        
        return nlist.stream()
			.mapToInt(i -> i)
            .toArray();
    }
}