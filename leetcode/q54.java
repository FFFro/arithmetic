package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 用队列实现栈
 *
 * @author : FFFro
 * @date : 2019-12-19 21:05
 **/
public class q54 {

    class MyStack {

        private Queue<Integer> queue;
        /** Initialize your data structure here. */
        public MyStack() {
            queue = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.offer(x);
        }


        private void shift() {
            int size = queue.size();
            for (int i = 0; i < size - 1; i++) {
                queue.offer(queue.poll());
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            shift();
            return queue.poll();
        }

        /** Get the top element. */
        public int top() {
            shift();
            int res = queue.poll();
            queue.offer(res);
            return res;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}

//使用队列实现栈的下列操作：
//
//        push(x) -- 元素 x 入栈
//        pop() -- 移除栈顶元素
//        top() -- 获取栈顶元素
//        empty() -- 返回栈是否为空
//        注意:
//
//        你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
//        你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
//        你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。