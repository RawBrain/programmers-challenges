class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n];
        for(int i : lost){
            stu[i-1]--;
        }
        for(int i : reserve){
            stu[i-1]++;
        }
        
        for(int i=0; i<stu.length; i++){
            if(stu[i]==0 || stu[i]==1){
                answer++;
            }
        }
        
        for(int i=0; i<stu.length; i++){
            if(stu[i] == -1){
                if(i-1 >= 0 && stu[i-1] == 1){
                    answer++;
                    stu[i-1] = 0;
                }else if(i+1 < stu.length && stu[i+1] == 1){
                    answer++;
                    stu[i+1] = 0;
                }
            }
        }
        return answer;
    }
}