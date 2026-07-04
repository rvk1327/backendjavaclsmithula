package chapter3;

import java.util.*;

public class AnnotationDemo {

	public static void main(String[] str) {
		
		Answer ans  = new Answer();
		ans.showInfo("world wide web", "Ms.Mithula");
		
		@SuppressWarnings("checked")
		List<Integer> lst = new ArrayList<Integer>();
		
		ans.calc1();
		ans.calc2();
	}
}


class Question {
	
	public void showInfo(String question_id, String question_name) {
		
		System.out.println("Question ID :  " + question_id);
		System.out.println("Question Name : " + question_name);
	}
}


class Answer extends Question {
	
	@Override
	public void showInfo(String answer, String posted_by) { 		
		
		System.out.println("Answer : " + answer);
		System.out.println("Posted By : " + posted_by);
	}
	
	@Deprecated
	public void calc1() {
		
		System.out.println(10+20);
	}
	
	public void calc2() {
		
		System.out.println(10+20);
		System.out.println(10-20);
		System.out.println(10*30);
		System.out.println(10/40);
	}
}


@FunctionalInterface
interface Remote {
	
	public void display();
	//public void display1();
}






