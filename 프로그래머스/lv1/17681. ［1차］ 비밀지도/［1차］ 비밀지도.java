class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[arr1.length];
        
        for(int i=0; i<arr1.length; i++) {
        	long num =Long.parseLong(Long.toString(arr1[i],2)) + Long.parseLong(Long.toString(arr2[i],2));
        	String str = Long.toString(num);
        	answer[i] = str;
        }
        
        for(int i=0; i<answer.length; i++) {
        	String str = "";
        	for(int j=0; j<answer.length-answer[i].length(); j++) {
        		str = str + " ";
        	}
        	for(int k=0; k<answer[i].length(); k++) {
        		if(answer[i].substring(k, k+1).equals("0")==true) {
        			str = str + " ";
        			}else {
        				str = str + "#";
        			}
        	}
        	answer[i] = str;
        }
        
        return answer;
    }
}