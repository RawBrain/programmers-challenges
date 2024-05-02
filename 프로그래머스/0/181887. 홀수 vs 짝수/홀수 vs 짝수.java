class Solution {
    
    public int oddsum(int[] num_list){
        int sum = 0;
        for(int i=0; i<num_list.length; i=i+2){
            sum +=num_list[i];
        }
        return sum;
    }
    
    public int evensum(int[] num_list){
        int sum = 0;
        for(int i=1; i<num_list.length; i=i+2){
            sum += num_list[i];
        }
        return sum;
    }
    
    public int solution(int[] num_list) {
        return oddsum(num_list) < evensum(num_list) ? evensum(num_list) : oddsum(num_list);
    }
}