class Solution {
    public long solution(int a, int b, int n) {
        int answer = 0;
        int coke = 0;
        
        while(n>=a){
            coke = (n/a)*b;
            n = coke + (n%a);
            answer = answer + coke;
        }
        
        return answer;  
    }
}
//about 5mins