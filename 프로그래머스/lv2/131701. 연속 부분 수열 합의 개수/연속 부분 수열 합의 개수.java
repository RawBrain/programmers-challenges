import java.util.*;
import java.util.stream.*;
class Solution {
		public int solution(int[] elements) {
	        int answer = 0;
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for(int i=1; i<=elements.length; i++){
	            for(int j=0; j<elements.length; j++){
	                list.add(sum(j,i,elements));
	            }
	        }
	        answer = list.stream().distinct().collect(Collectors.toList()).size();
	        return answer;
	    }
	    
	    public static int sum(int index, int n, int[] el){
	        int sum = 0;
	        
	        for(int i=0; i<n; i++){
	            if(index+i == el.length){
	                index = -i;
	            } 
	            sum = sum+ el[index+i];
	        }
	        return sum;
	        
	    }
}