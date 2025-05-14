import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQue {
    public static void main(String[] args) {
        // Stack(LIFO) Implementation
        Stack<Integer> stack = new Stack<>();
        //add elements in stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from stack: " + stack.pop()); //remove 30
        System.out.println("Stack after pop: " + stack);

        // Queue(FIFO) Implementation
        Queue<Integer> queue = new LinkedList<>();
        //add elements in queue
        queue.add(10); 
        queue.add(20);
        queue.add(30);
        System.out.println("\nQueue: " + queue);
        System.out.println("Removed from queue: " + queue.poll()); //remove 10
        System.out.println("Queue after removal: " + queue);
    }
}