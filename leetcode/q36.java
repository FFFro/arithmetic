package leetcode;

import java.util.Stack;

/**
 * @program: arithmetic
 * @description: 最小栈
 * @author: FFFro
 * @create: 2019-12-06 23:00
 **/

public class q36 {


    class MinStack {

        private Stack<Integer> a;
        private Stack<Integer> b;

        /** initialize your data structure here. */
        public MinStack() {
            a = new Stack<>();
            b = new Stack<>();
        }

        public void push(int x) {
            a.push(x);
            if (b.isEmpty() || x <= b.peek()) {
                b.push(x);
            }
        }

        public void pop() {
            int pop = a.pop();
            if (b.peek() == pop) {
                b.pop();
            }

        }

        public int top() {
            return a.peek();
        }

        public int getMin() {
            return b.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}


//    设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
//
//        push(x) -- 将元素 x 推入栈中。
//        pop() -- 删除栈顶的元素。
//        top() -- 获取栈顶元素。
//        getMin() -- 检索栈中的最小元素。
//        示例:
//
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        minStack.getMin();   --> 返回 -3.
//        minStack.pop();
//        minStack.top();      --> 返回 0.
//        minStack.getMin();   --> 返回 -2.