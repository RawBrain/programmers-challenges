class Solution {
    public String solution(String rsp) {
        return rsp.replace("2", "7").replace("0", "8").replace("5", "9").replace("7", "0").replace("8", "5").replace("9", "2");
    }
}