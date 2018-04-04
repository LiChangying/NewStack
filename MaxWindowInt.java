	//有一个整型数组arrSource和窗口window从数组的最左边滑到最右边，窗口每次向右滑动一个位置，产生每个窗口的最大值。
  //----------------时间复杂度为O(N*W)---------------------------//
	public static int[] getMaxWindowN_W(int[] arrSource,int window) {
		int[] arr = new int[arrSource.length - window + 1];
		for (int i = 0; i < arr.length; i++) {
			int temp = arrSource[i];
			for (int j = i + 1; j < i + window; j++) {
				if (temp < arrSource[j]) {
					temp = arrSource[j];
				}
			}
			arr[i] = temp;
		}
		return arr;
	}
	//----------------时间复杂度为O(N)------------------------------//
	public static int[] getMaxWindowN(int[] arrSource,int window) {
		if (arrSource == null || window < 1 || arrSource.length < window) {
			return null;
		}
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int[] res = new int[arrSource.length -window + 1];
		int index = 0;
		for (int i = 0; i < arrSource.length; i++) {
			while (!qmax.isEmpty() && arrSource[qmax.peekLast()] <= arrSource[i]) {
				qmax.pollLast();
			}
			qmax.addLast(i);
			if (qmax.peekFirst() == i - window) {
				qmax.pollFirst();
			}
			if (i >= window - 1) {
				res[index ++] = arrSource[qmax.peekFirst()];
			}
		}
		return res;
	}
