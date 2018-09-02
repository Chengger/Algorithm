package ArrayandStack;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 用两个队列实现一个栈结构
 * @author Administrator
 *
 */

public class twoQueueStack {
	private Queue<Integer> data;
	private Queue<Integer> help;
	public twoQueueStack() {
		data = new LinkedList<Integer>();
		help = new LinkedList<Integer>();
	}
	public void push(int newNum) {
		data.add(newNum);
	}
	public Integer pop() {
		if (data.isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		while (data.size() > 1) {
			help.add(data.poll());
		}
		int res = data.poll();
		swap();
		return res;
	}
	public int peek() {
		if (data.isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		while(data.size() != 1) {
			help.add(data.poll());
		}
		int res = data.poll();
		help.add(res);
		swap();
		return res;
	}
	private void swap() {
		Queue<Integer> tmp = help;
		help = data;
		data = tmp;
	}
	
	
}
