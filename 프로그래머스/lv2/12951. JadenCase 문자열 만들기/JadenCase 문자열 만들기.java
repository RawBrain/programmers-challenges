class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        for(int i=0; i<arr.length; i++){
            String str = arr[i];
            if(str.equals("")){
                
            }else if(str.charAt(0)>=49 && str.charAt(0)<=58){
                str = str.substring(0,1) + str.substring(1).toLowerCase();
            }else {
            	str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
            }
            arr[i] = str;
        }
        answer = String.join(" ", arr);
        return answer;
    }
}