package com.ruby.java.ch08.innerClass;

public class 객체배열외부클레스 {
	class Student {
		int sid;
		String sname;

		Student(int sid, String sname) {
			this.sid = sid;
			this.sname = sname;
		}
		public String toString() {
			return "sid = "+ sid + "sname = "+sname;
		}
		void show() {
			System.out.println(this.toString());
			//System.out.println("sid = "+ sid +", sname = " + sname);
		}
	}


//package com.ruby.java.ch08.innerClass;

	public static void main(String[] args) {
		int[] data = new int[10];
		Student[] sdata = new Student[10];
		data[0] = 10;
		객체배열외부클레스 my = new 객체배열외부클레스();
		sdata[0] = my.new Student(2023, "Kim");
		sdata[1] = my.new Student(2022, "Lee");
		sdata[2] = my.new Student(2021, "Park");
		sdata[3] = my.new Student(2020, "Choi");
		sdata[4] = my.new Student(2019, "Hong");
		for (int i = 0; i < 5; i++) {
			sdata[i].show();
		}
	}
}

