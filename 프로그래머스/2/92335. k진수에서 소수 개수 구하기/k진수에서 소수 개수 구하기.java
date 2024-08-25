class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] numlist = Integer.toString(n,k).split("0+");
        
        for(String num : numlist){
            if(!num.isEmpty()){
                if(isPrime(Long.parseLong(num)) == true){
                    answer++;
                }   
            }
        }
        
        return answer;
    }
    
    
    public static boolean isPrime(long num){
        if(num <= 1){
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}