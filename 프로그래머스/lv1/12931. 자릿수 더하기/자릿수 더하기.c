#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int a;
    for(int i=100000000; i>=1; i=i/10){
        
        a = n/i;
        n = n - (a*i);
        answer = answer + a;
    }
    return answer;
}