class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isLowerCase(ch)==true){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}