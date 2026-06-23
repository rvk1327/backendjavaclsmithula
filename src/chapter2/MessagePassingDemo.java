package chapter2;

public class MessagePassingDemo {

	public static void main(String[] str) {
		
		Student st = new Student();
		st.rollno = "st-2";
		st.stname = "def";
		st.rank = 3;
		
		ObjectArgument obj = new ObjectArgument();
		String msg1 = "welcome";
		obj.show(msg1, st);
	
		ObjectReturn obj1 = new ObjectReturn();
		Student st1  = obj1.getStudent();
		st1.displayStudent();
		
	}
}


class ObjectArgument {
	
	public void show(String msg , Student st1) {
		st1.displayStudent();
	}
}

class ObjectReturn {
	
	public Student getStudent() {
		
		Student st = new Student();
		return st;
	}
}




