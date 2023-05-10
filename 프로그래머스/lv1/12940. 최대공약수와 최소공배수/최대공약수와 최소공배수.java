class Solution {
	    public static int[] solution(int n, int m) {
            int[] answer = new int[2];
            answer[0] = solveMax(n,m);
	        answer[1] = n*m/answer[0];

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