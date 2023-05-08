package chapter5;

public class Armor {
	
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	
	public void setHeight(int value) { //void = return값 없음
		height = value;
	}
	public void setName() {
		String value = "mark6";
		name = value;
	}
	public String getName() {
		if (name == null)
			return "No Name";
		return name;
	}
}
