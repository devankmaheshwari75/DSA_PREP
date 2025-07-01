import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {

    public static void main(String[] args) {
        
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addLast(1);
        deque.addFirst(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.addFirst(7);
        deque.remove();
        deque.removeLast();
        deque.removeFirst();


        System.out.println(deque.toString());

    }
    
}
