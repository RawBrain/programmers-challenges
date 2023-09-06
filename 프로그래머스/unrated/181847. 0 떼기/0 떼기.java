class Solution {
    public String solution(String n_str) {
        int n =0;
        for(int i=0; i<n_str.length(); i++){
            if(n_str.charAt(i)-'0'==0){
                n++;
            }else{
                break;
            }
        }
        return n_str.substring(n,n_str.length());
    }
}