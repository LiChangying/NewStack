package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack1 myStack1 = new MyStack1();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			String str2 = sc.nextLine();
			int[] x = new int[str.split(" ").length];
			for (int i = 0; i < str.split(" ").length; i++) {
				x[i] = Integer.parseInt(str.split(" ")[i]);
				myStack1.push(x[i]);
			}
			int min = myStack1.getMin();
			System.out.println(min);
		}
		sc.close();
	}
}
