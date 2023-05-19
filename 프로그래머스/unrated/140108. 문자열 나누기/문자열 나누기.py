def solution(s):
    answer = 0
    s=list(s)
    wcount=1
    dwcount=0
    index=1
    while len(s)>=1: # sss aaaaaabcdf
        if wcount+dwcount >=len(s):
            answer+=1
            break            
        if wcount==dwcount:
            answer+=1
            del s[0:wcount + dwcount]
            index=0
            wcount=1
            dwcount=0
        else:
            if s[0]==s[index]:
                wcount+=1
            else:
                dwcount+=1
                
        if len(s)>1:
            index+=1
        else:
            answer+=1
            break
    
    return answer