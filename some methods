//remove and return stack end element
//使用递归的方法对栈逆序
public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();//result is stack top element
		if (stack.isEmpty()) {//if stack is empty, it illustrate result is stack end element 
			return result;
		}else{
			int last = getAndRemoveLastElement(stack);//recursion
			stack.push(result);//repop stack element
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
//------------------------------------------------------------------------------
//主要实现通过一个栈来给另外一个栈进行栈内数据排序，并且将排序后的栈数据返还到原先栈中，实现栈中数据递减，同样可以实现递增。
public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!stack.isEmpty()){//if stack is no empty,continue always
			int cnt = stack.pop();
			while (!stack2.isEmpty() && stack2.peek() > cnt) {
				stack.push(stack2.pop());
			}
			stack2.push(cnt);
		}
		while (!stack2.isEmpty()) {
			stack.push(stack2.pop());
		}
	}
