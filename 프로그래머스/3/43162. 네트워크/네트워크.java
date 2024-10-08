class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(computers, i);
                answer++;
            }
        }
        return answer;
    }
    
    public void bfs(int[][]computers, int node){
        visited[node] = true;
        for(int i=0; i<computers[node].length; i++){
            if(computers[node][i]==1 && !visited[i]){
                bfs(computers, i);
            }   
        }
    }
}