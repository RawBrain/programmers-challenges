class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    boolean prime = true;
                    sum = nums[i]+nums[j]+nums[k];                    
                    for(int n=2; n<=sum/2; n++){
                        if(sum%n==0){
                            prime = false;
                            break;
                        }
                    }
                    if(prime == true){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}