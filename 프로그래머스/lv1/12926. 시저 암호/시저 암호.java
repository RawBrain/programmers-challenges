class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] strary = s.toCharArray();
        int j = 0;
        for(char i : strary) {
        	int num = 0;
        	if(i == ' '){
        		num = 32;
        	}else if(Character.isUpperCase(i)){
        		num = (int)i+n;
        		if(num > 90) {
        			num= num - 26;
        		}
        	}else {
        		num = (int)i+n;
        		if(num > 122) {
        			num = num - 26;
        		}
        	}

    		strary[j] = (char)num;
        	j++;
        }
        answer = String.valueOf(strary);
        
        return answer;
    }
}