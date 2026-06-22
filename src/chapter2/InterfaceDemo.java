package chapter2;

public class InterfaceDemo {

	public static void main(String[] str) {
		
		TV t = new TV();
		t.channelInfo(); //interface method
		t.additionalInfo(); //class method
		
		//Features of an interface
		
		//Feature #1: Access interface method only
		Remote r1 = new TV();
		r1.channelInfo();
		
		//Feature #2: Is it possible to create an object for an interface? : Yes
		Remote r2 = new Remote() {
			
			public void channelInfo() {
				
				System.out.println("Channel Name : " + CHANNEL_NAME);
				System.out.println("Show Time : 11.00PM");
			}
		};
		
		r2.channelInfo();
	}
}

interface Remote {
	
	public void channelInfo();
	String CHANNEL_NAME = "SUN MUSIC";
}


class TV implements Remote {
	
	public void channelInfo() {
		
		System.out.println("Channel Name : " + CHANNEL_NAME);
		System.out.println("Show Time : 9.00PM");
	}
	
	public void additionalInfo() {
		
		System.out.println("Channel Name :  " + CHANNEL_NAME);
		System.out.println("Show time : 10.00PM");
	}
}
