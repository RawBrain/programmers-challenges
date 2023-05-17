class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int gcount = 0;
        String str = "";
        for(int i=0; i<dartResult.length(); i++) {
        	str = dartResult.substring(i, i+1);
        	
        	if(str.matches("\\d")) {
                if(i < dartResult.length()-1 && dartResult.substring(i+1,i+2).matches("\\d")){
                str = str + dartResult.substring(i+1,i+2);
                i++;
            }
        		score[gcount] = Integer.parseInt(str);
                
        	}else if(str.equals("S")) {
        	    gcount++;
        	}else if(str.equals("D")) {
        		score[gcount] = score[gcount]*score[gcount];
                gcount++;
        	}else if(str.equals("T")) {
        		score[gcount] = score[gcount]*score[gcount]*score[gcount];
                gcount++;
        	}else if(str.equals("*")) {
        		score[gcount-1]= score[gcount-1]*2;
        		if(gcount-2 >= 0) {
            		score[gcount-2] = score[gcount-2]*2;
        		}
        	}else if(str.equals("#")) {
                if(gcount-1 >= 0) {
            		score[gcount-1] = score[gcount-1]*-1;
        		}
        	}
        }
        answer = score[0] + score[1] + score[2];
        System.out.println(score[0]);
                System.out.println(score[1]);
                System.out.println(score[2]);
        return answer;
    }
}
//about 30mins