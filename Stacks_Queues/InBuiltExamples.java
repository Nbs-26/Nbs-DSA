package Stacks_Queues;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack =new Stack<>();
        // stack.push(4); 
        // stack.push(5);
        // stack.push(6);
        // stack.push(7);
        // stack.push(7);
        // stack.push(7);
        // System.out.println(stack.capacity());
        // System.out.println(stack.contains(5));
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.empty());
        // System.out.println(stack.pop());
        // CustomStack stack2=new CustomStack(5);
        // stack2.push(1);
        // stack2.push(2);
        // stack2.push(3);
        // stack2.push(4);
        // stack2.push(5);
        // System.out.println(stack2.pop());
        // System.out.println(stack2.pop());
        // System.out.println(stack2.pop());
        // System.out.println(stack2.pop());
        // System.out.println(stack2.pop());
        
        // DynamicStack stack3=new DynamicStack(5);
        // stack3.push(1);
        // stack3.push(2);
        // stack3.push(3);
        // stack3.push(4);
        // stack3.push(5);
        // stack3.push(6);
        // System.out.println(stack3.pop());
        // System.out.println(stack3.pop());
        // System.out.println(stack3.pop());
        // System.out.println(stack3.pop());
        // System.out.println(stack3.pop());
        // System.out.println(stack3.pop());


        // CircularQueue queue=new CircularQueue(5);
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);
        // queue.display();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.add(133);
        // queue.add(134);
        // queue.display();

        DynamicCircularQueue queue=new DynamicCircularQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(5);
        queue.display();
        queue.remove();
        queue.remove();
        // queue.remove();
        // queue.add(133);
        // queue.add(134);
        queue.display();
    }
}
