class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        for(int i=0; i<arr.length; i++){
            answer = answer*arr[i]/solveMax(answer, arr[i]);
        }
        return answer;
    }
    
    public static int solveMax(int a, int b) {
	        int max = 1;
	        if(b<a){
	            int x = a;
	            a = b;
	            b = x;
	        }
	        
	        while(a<b){
	                max = b%a;
	                if(max == 0) {
	                	break;
	                }
	                b = a;
	                a = max;
	        }
	        return a;
	    }
}