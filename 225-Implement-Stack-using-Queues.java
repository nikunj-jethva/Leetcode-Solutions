/*
LeetCode #225 - Implement Stack using Queues

Difficulty: Easy

Approach:
Two Queues

To maintain LIFO order:

Push Operation:
1. Move all elements from main queue to helper queue.
2. Insert new element into main queue.
3. Move all elements back from helper to main.

This ensures the newest element always stays at
the front of the main queue.

Time Complexity:
push()  -> O(n)
pop()   -> O(1)
top()   -> O(1)
empty() -> O(1)

Space Complexity: O(n)
*/



class MyStack {

    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {

        while (main.size() > 0) {
            helper.add(main.remove());
        }

        main.add(x);

        while (helper.size() > 0) {
            main.add(helper.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        return main.size() == 0;
    }
}
