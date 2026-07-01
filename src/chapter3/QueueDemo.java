package chapter3;

import java.util.*;

public class QueueDemo {

	public static void main(String[] str) {
		
		Queue q = new ArrayDeque();
		
		q.offer(100);
		q.offer(200);
		q.offer(300);
		
		System.out.println(q.peek());
		
		q.poll();
		
		System.out.println(q);
	}
	
}
