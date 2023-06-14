class Solution {
    public int solution(String str1, String str2) {
        return str2.length() == str2.replaceAll(str1, "").length() ? 0 : 1;
    }
}