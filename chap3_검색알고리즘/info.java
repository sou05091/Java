package chap3_검색알고리즘;

import java.util.Arrays;

class PhyscData implements Comparable<PhyscData>{
	private String name;
	private int height;
	private double vision;
	
	public PhyscData(String name, int height, double vision) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	public int compareTo(PhyscData pd) {
		if (this.name.compareTo(pd.name) == 0)
			return Integer.compare(this.height, pd.height);
			if (this.height == pd.height)
				return Double.compare(this.vision, pd.vision);
				if(this.vision == pd.vision)
					return 0;
				else 
					return this.name.compareTo(pd.name);
		// TODO Auto-generated method stub
	}
	
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public double getVision() {
		return vision;
	}
	
	static void showData(PhyscData[] data) {
		// TODO Auto-generated method stub
		for(int i=0; i < data.length; i++) {
		System.out.println(data[i].getName() + "  " + data[i].getHeight() +"  "+ data[i].getVision());
		}
	}

	static void sortData(PhyscData[] data) {
		// TODO Auto-generated method stub
		Arrays.sort(data);
	}
}

public class info {
	

	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("길동", 182, 0.6),
				new PhyscData("길동", 167, 0.2),
				new PhyscData("길동", 167, 0.5),
		};
//		PhyscData.showData(data);
		PhyscData.sortData(data);
		PhyscData.showData(data);
	}
}