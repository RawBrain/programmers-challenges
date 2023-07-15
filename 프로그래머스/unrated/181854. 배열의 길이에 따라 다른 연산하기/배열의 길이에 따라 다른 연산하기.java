class Solution {
    public int[] solution(int[] arr, int n) {
        int index = 0;
        if(arr.length%2==0){
            index =1;
        }
        for(int i=index; i<arr.length; i=i+2){
            arr[i] +=n;
        }
        return arr;
    }
}