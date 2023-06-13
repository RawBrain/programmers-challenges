class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        int index = 0;
        int last = -1;
        for(int i=9; i>priorities[location]; i--){
            index = last+1;
            if(index ==priorities.length){
                index=0;
            }
            for(int j=0; j<priorities.length; j++){
                if(priorities[index]==i){
                    answer++;
                    last = index;
                    priorities[index] = 0;
                }
                if(index<priorities.length-1){
                    index++;
                }else{
                    index = 0;
                }
            }
        }
        index = last+1;
        System.out.println(index);
        while(index != location){
            if(priorities[index]==priorities[location]){
                answer++;
            }
            if(index<priorities.length-1){
                index++;
            }else{
                index = 0;
            }
        }
        return answer;
    }
}