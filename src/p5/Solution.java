package p5;

import java.util.ArrayList;

public class Solution  {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		System.out.println(list.get(2));
		list.add(2, 5);
		System.out.println(list);
		System.out.println(list.get(2));
		
}
}
