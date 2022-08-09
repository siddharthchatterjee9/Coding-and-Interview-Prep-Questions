package _232_implementQueueUsingStacks;

// https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    public ImplementQueueUsingStacks() {

    }

    public void push(int x) {
        pushStack.push(x);
    }
    private void convertPushStackToPopStack() {
        while (!pushStack.isEmpty()) {
            int temp = pushStack.pop();
            popStack.push(temp);
        }
    }

    public int pop() {
        if (popStack.isEmpty()) {
            convertPushStackToPopStack();
        }
        return popStack.pop();
    }

    public int peek() {
        if (popStack.isEmpty()) {
            convertPushStackToPopStack();
        }
        return popStack.peek();
    }

    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}
