package chapter11;

public class Test03 {
	public static void c() throws Exception{
		String s = null;
		s.length();
	}

	public static void main(String[] args) {
		try {
		c();
		} catch(Exception e){
			
		}
	}
}
