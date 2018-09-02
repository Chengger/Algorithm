package ArrayandStack;

import java.util.Stack;
/**
 * ������ջʵ��һ�����нṹ
 * @author Administrator
 *	pushջ���뵹�꣬popջҲ���뵹��
 */
public class twoStackQueue {
	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;
	public twoStackQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}
	public void push(int newNum) {
		stackPush.push(newNum);
	}
	public int poll() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("queue is empty");
		}
		dao();
		return stackPop.pop();
	}
	public int peek() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("queue is empty");
		}
		dao();
		return stackPop.peek();
	}
	public void dao() {
		if (!stackPop.isEmpty()) {
			return;
		}
			while(!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
	}
}
