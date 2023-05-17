class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int clean = 0;
        
        for(int i=0; i<section.length; i++){
            clean = section[i]+m-1;
            answer++;
            System.out.println(answer);
            while(i+1<section.length && section[i+1]<=clean){
                i++;
            }
        }
        return answer;
    }
}
//about 50mins