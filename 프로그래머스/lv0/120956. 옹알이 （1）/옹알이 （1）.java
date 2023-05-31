class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            String str = babbling[i].replaceAll("aya", "1");
            str = str.replaceAll("ye", "1");
            str = str.replaceAll("woo", "1");
            str = str.replaceAll("ma", "1");
            System.out.println(str);
            try{
                Integer.parseInt(str);
                answer++;
            }catch(NumberFormatException ex){}
        }
        return answer;
    }
}