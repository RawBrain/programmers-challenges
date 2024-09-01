import java.util.*;

class Solution {
    private DoubleEndedPriorityQueue<Integer> deque;

    public Solution() {
        this.deque = new DoubleEndedPriorityQueue<>();
    }

    public int[] solution(String[] operations) {
        for (String str : operations) {
            if (str.equals("D 1")) {
                deque.pollMax();
            } else if (str.equals("D -1")) {
                deque.pollMin();
            } else {
                int num = Integer.parseInt(str.substring(2));
                deque.add(num);
            }
        }

        if (deque.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{deque.peekMax(), deque.peekMin()};
        }
    }
}

class DoubleEndedPriorityQueue<E extends Comparable<E>> {
    private TreeSet<E> set;

    public DoubleEndedPriorityQueue() {
        this.set = new TreeSet<>();
    }

    public void add(E element) {
        set.add(element);
    }

    public E peekMin() {
        return set.isEmpty() ? null : set.first();
    }

    public E peekMax() {
        return set.isEmpty() ? null : set.last();
    }

    public E pollMin() {
        return set.isEmpty() ? null : set.pollFirst();
    }

    public E pollMax() {
        return set.isEmpty() ? null : set.pollLast();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public int size() {
        return set.size();
    }
}