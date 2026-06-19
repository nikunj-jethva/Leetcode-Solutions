/*
LeetCode #155 - Min Stack

Difficulty: Medium

Approach:
Two Stacks

1. One stack stores all elements.
2. Another stack stores the minimum elements.
3. While pushing:
   - Push to min stack if current value is smaller
     than or equal to current minimum.
4. While popping:
   - Remove from min stack if popped element is
     the current minimum.

Time Complexity:
push()   -> O(1)
pop()    -> O(1)
top()    -> O(1)
getMin() -> O(1)

Space Complexity: O(n)
*/

import java.util.Stack;

class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int value) {

        if (st.isEmpty() || min.peek() >= value) {
            min.push(value);
        }

        st.push(value);
    }

    public void pop() {

        int ele1 = st.pop();
        int ele2 = min.peek();

        if (ele1 == ele2) {
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
