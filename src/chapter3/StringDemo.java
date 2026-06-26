package chapter3;

public class StringDemo {

	public static void main(String[] str) {
		
		String st = "welcome";
		String st1 = new String("hello");
		
		char c  = st.charAt(5);
		System.out.println(c);
		
		int c1 = st.codePointAt(5);
		System.out.println(c1);
		
		String ccate = st.concat(" java");
		System.out.println(ccate);
		
		boolean res1 = st.contains("wlo");
		System.out.println(res1);
		
		boolean res2 = st.endsWith("ome");
		System.out.println(res2);
		
		boolean res3 = st.startsWith("wel");
		System.out.println(res3);
		
		boolean res4 = st.equals("Welcome");
		System.out.println(res4);
		
		boolean res5 = st.equalsIgnoreCase("WeLcOmE");
		System.out.println(res5);
		
		byte[] by = st.getBytes();
		for(int i=0; i<by.length; i++) {
			System.out.println(by[i]);
		}
		
		String indent = st.indent(10);
		System.out.println(indent);
		
		int pos = st.indexOf("e");
		System.out.println(pos);
		
		int pos1 = st.lastIndexOf("e");
		System.out.println(pos1);
		
		boolean res6 = st.isBlank();  // st = "    ";  true
		System.out.println(res6);
		
		boolean res7 = st.isEmpty(); // st
		System.out.println(res7);
		
		int total_chars = st.length();
		System.out.println(total_chars);
		
		String rep = st.repeat(3);
		System.out.println(rep);
		
		String repl = st.replace("elc","ABC");
		System.out.println(repl);
		
		String s = "welcome to java";
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}
		
		String substr = st.substring(2, 5);
		System.out.println(substr);
		
		char[] ch = st.toCharArray();
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String upper = st.toUpperCase();
		System.out.println(upper);
	}
}

//class StringDemo end
