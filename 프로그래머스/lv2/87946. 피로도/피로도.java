class Solution {
    static int max = Integer.MIN_VALUE;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        return max;
    }
    
    static public void dfs(int k, int[][] dungeons, boolean[] visited, int count){
        if(max<count){
            max = count;
        }
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]){
                if(k >= dungeons[i][0]){
                    k-=dungeons[i][1];
                    visited[i] = true;
                    count++;
                    dfs(k, dungeons, visited, count);
                    count--;
                    visited[i] = false;
                    k+=dungeons[i][1];
                }
            }
        }
    }
    
}