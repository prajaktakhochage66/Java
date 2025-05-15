
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.err.println("Stack:" + stack);
        System.err.println("Popped form stack:" + stack.pop());
        System.err.println("Stack after pop:" + stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.err.println("Queue : " + queue);
        System.err.println("Removed elements for queue:" + queue.poll());
        System.err.println("Queue after removing number:" + queue);
    }
}
