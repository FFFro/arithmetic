package leetcode;

import java.util.List;
import java.util.Stack;

/**
 * 用栈实现队列
 *
 * @author : FFFro
 * @date : 2019-12-21 21:39
 **/
public class q57 {

    class MyQueue {

        private Stack<Integer> stack;

        private Stack<Integer> temp;

        private int top;

        /** Initialize your data structure here. */
        public MyQueue() {
            stack = new Stack<>();
            temp = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            if (stack.empty()) {
                top = x;
            }
            stack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (stack.size() == 1) {
                top = 0;
            }
            while (stack.size() != 1) {
                temp.push(stack.pop());
            }
            int res = stack.pop();
            if (res == top) {
                top = temp.peek();
            }
            while (!temp.empty()) {
                stack.push(temp.pop());
            }

            return res;
        }

        /** Get the front element. */
        public int peek() {
            return top;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack.empty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}



//使用栈实现队列的下列操作：
//
//        push(x) -- 将一个元素放入队列的尾部。
//        pop() -- 从队列首部移除元素。
//        peek() -- 返回队列首部的元素。
//        empty() -- 返回队列是否为空。
//        示例:
//
//        MyQueue queue = new MyQueue();
//
//        queue.push(1);
//        queue.push(2);
//        queue.peek();  // 返回 1
//        queue.pop();   // 返回 1
//        queue.empty(); // 返回 false
//        说明:
//
//        你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
//        你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
//        假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
