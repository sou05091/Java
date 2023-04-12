package chapter7;

public class Misson {
	private int num;
	public Misson() {
		// TODO Auto-generated constructor stub
		
	}
	
	public int getNum() {
		for(int i=1; i<=1000; i++) {
			 num += i;
			}
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Misson [num=" + getNum() + "]";
	}

	public static void main(String[] args) {
		Misson s = new Misson();
		System.out.println(s.toString());
	}

}
