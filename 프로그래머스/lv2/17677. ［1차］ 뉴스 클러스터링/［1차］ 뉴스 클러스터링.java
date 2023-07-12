import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int union =0;
        int intersection =0;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i=0; i<str1.length()-1; i++){
            if(str1.charAt(i) > 96 && str1.charAt(i) < 123 && str1.charAt(i+1) > 96 && str1.charAt(i+1) < 123){
                String st1 = str1.substring(i, i+2);
                if(!map1.containsKey(st1)) {
                	map1.put(st1, 1);
                	set.add(st1);
                }else {
                	map1.put(st1, map1.get(st1)+1);
                }
            }
        }
        
        for(int i=0; i<str2.length()-1; i++){
            if(str2.charAt(i) > 96 && str2.charAt(i) < 123 && str2.charAt(i+1) > 96 && str2.charAt(i+1) < 123){
            	String st2 = str2.substring(i, i+2);
                if(!map2.containsKey(st2)) {
                	map2.put(st2, 1);
                	set.add(st2);
                }else {
                	map2.put(st2, map2.get(st2)+1);
                }
            }
        }
        
        for(String s : set) {
        	union+=Math.max(map1.getOrDefault(s, 0), map2.getOrDefault(s, 0));
        }
        for(String s : map1.keySet()) {
        	if(map2.containsKey(s)) {
        		intersection+=Math.min(map1.get(s), map2.get(s));
        	}
        }
        
        answer = set.isEmpty() ? 65536 : (int)((double)intersection/union*65536);
        
        return answer;
    }
}