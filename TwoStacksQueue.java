package algorithm;

import java.util.Stack;

public class TwoStacksQueue {
	private Stack<Integer> stackPush;//only add element
	private Stack<Integer> stackPop;//only pop element
	
	public TwoStacksQueue() {
		// TODO Auto-generated constructor stub
		this.stackPush = new Stack<Integer>();
		this.stackPop = new Stack<Integer>();
	}
	
	public void add(int pushInt) {//push element to a stack
		stackPush.push(pushInt);
	}
	
	public int poll() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty");
		}else if (stackPop.empty()) {
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	
	public int peek() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty");
		}else if (stackPop.empty()) {
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
}
