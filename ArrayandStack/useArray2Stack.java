package ArrayandStack;
/**
 * 用数组结构实现大小固定的栈
 * @author Administrator
 *
 */
public class useArray2Stack {
	private Integer[] arr;
	private int index;
	public useArray2Stack(int initSize) {
		if (initSize < 0) {
			throw new IllegalArgumentException("the init size is less than 0");
		}
		arr = new Integer[initSize];
		index = 0;
	}
	public Integer peek() {
		if (index == 0) {
			return null;
		}
		return arr[index - 1];
	}
	public void push(int obj) {
		if (index == arr.length) {
			throw new ArrayIndexOutOfBoundsException("the stack is full");
		}
		arr[index++] = obj;
	}
	public Integer pop() {
		if (index == 0) {
			throw new ArrayIndexOutOfBoundsException("the stack is empty");
		}
		return arr[--index];
	}
}
