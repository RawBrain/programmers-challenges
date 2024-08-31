import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;

        // 최대 힙을 사용하기 위해 우선순위 큐를 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 작업량을 우선순위 큐에 삽입
        for (int work : works) {
            pq.offer(work);
        }
        
        // 작업량 줄이기
        while (n > 0 && !pq.isEmpty()) {
            int maxWork = pq.poll();
            if (maxWork == 0) break; // 작업량이 0이면 종료
            
            pq.offer(maxWork - 1);
            n--;
        }
        
        // 남은 작업량의 제곱합 계산
        while (!pq.isEmpty()) {
            int remainingWork = pq.poll();
            answer += (long) remainingWork * remainingWork;
        }
        
        return answer;
    }
}