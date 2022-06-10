package javadequeue;
// In computer science, a double-ended queue (dequeue, often abbreviated to deque,
// pronounced deck) is an abstract data type that generalizes a queue,
// for which elements can be added to or removed from either the front (head) or back (tail).
// Deque interfaces can be implemented using various types of collections
// such as LinkedList or ArrayDeque classes.

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hashSet.add(num);
            if (deque.size() == m) {
                if (hashSet.size() > maxUnique) {
                    maxUnique = hashSet.size();
                }
                Object first = deque.remove();
                if (!deque.contains(first)) {
                    hashSet.remove(first);
                }
            }
        }
        System.out.println(maxUnique);
    }
}
