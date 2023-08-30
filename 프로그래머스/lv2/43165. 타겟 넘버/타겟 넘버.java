class Solution {
    static int sum = 0;
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    static public void dfs(int[] numbers, int target, int sum, int count){
        if(count == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        dfs(numbers, target,sum + numbers[count], count+1);
        dfs(numbers, target,sum - numbers[count], count+1);
    }
    
}