package algorithm;

import java.util.Stack;

public class MyStack1 {
	private Stack<Integer> stackData;//私有变量
	private Stack<Integer> stackMin;//系统自带stack
	
	public MyStack1() {//构造方法
		// TODO Auto-generated constructor stub
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}
	
	public void push(int newNum) {//storage elements
		if (this.stackMin.isEmpty()) {//stackMin is empty,stackMin = newNum
			this.stackMin.push(newNum);
		}else if (newNum <= this.getMin()) {//stackMin is not empty,compare stackMin and newNum
			this.stackMin.push(newNum);		//return the least is stackMin
		}
		this.stackData.push(newNum);//ornot let newNum in stackData
	}
	
	public int pop() {//popping stack top element
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		int value = this.stackData.pop();
		if (value == this.getMin()) {
			this.stackMin.pop();
		}
		return value;
	}
	
	public int getMin() {//get stack min
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		return this.stackMin.peek();//return stack top element [n-1]
	}
}
