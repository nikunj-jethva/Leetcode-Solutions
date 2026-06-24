/*
LeetCode #232 - Implement Queue using Stacks

Difficulty: Easy

Approach:
Two Stacks

To maintain FIFO order:

Push Operation:
1. Move all elements from main stack to helper stack.
2. Push the new element into main stack.
3. Move all elements back from helper to main stack.

This ensures the front element always remains
on top of the main stack.

Time Complexity:
push()  -> O(n)
pop()   -> O(1)
peek()  -> O(1)
empty() -> O(1)

Space Complexity: O(n)
*/

import java.util.Stack;

class MyQueue {

    private Stack<Integer> main;
    private Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {

        while (main.size() > 0) {
            helper.push(main.pop());
        }

        main.push(x);

        while (helper.size() > 0) {
            main.push(helper.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.size() == 0;
    }
}
