package ArrayandStack;

import java.util.Stack;

import com.sun.xml.internal.ws.api.server.SDDocument;

/**
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返
 * 回栈中最小元素的操作。
 * @author Administrator
 *方法：设计两个栈，一个放data，一个放min，同时pop，push，min栈存入的是data中现有数据的最小值
 */
public class getMinStack {
	public static void main(String[] args) {
		MyStack2 stack2 = new MyStack2();
		stack2.push(12);
		stack2.push(1);
		stack2.push(54);
		stack2.push(32);
		System.out.println(stack2.getMin());
		System.out.println("============================");
		MyStack1 stack1 = new MyStack1();
		stack1.push(22);
		stack1.push(134);
		stack1.push(14);
		stack1.push(32);
		System.out.println(stack1.getMin());
	}
	public static class MyStack1{
		private Stack<Integer> stackData;
		private Stack<Integer> stackMin;
		public MyStack1() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}
		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			}else if (newNum <= this.getMin()) {
				this.stackMin.push(newNum);
			}
			this.stackData.push(newNum);
		}
		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("your stack is empty");
			}
			int value = this.stackData.pop();
			if (value == this.getMin()) {
				this.stackMin.pop();
			}
			return value;
		}
		public int getMin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("your empty is empty");
			}
			
			return this.stackMin.peek();
		}
	}
	
	public static class MyStack2 {
		private Stack<Integer> stackData;
		private Stack<Integer> stackMin;
		public MyStack2() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}
		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			}else if (newNum <= this.getMin()) {
				this.stackMin.push(newNum);
			}else {
				this.stackMin.push(this.stackMin.peek());
			}
			this.stackData.push(newNum);
		}
		private int getMin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("your stack is empty");
			}
			return this.stackMin.peek();
		}
		public Integer pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("your stack is empty");
			}
			this.stackMin.pop();
			return this.stackData.pop();
		}
		
	}
	
}
