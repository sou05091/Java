package chapter11;

import java.io.FileInputStream;

public class Test02 {
	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream("a.txt")) {
			//fi = new FileInputStream("a.txt");
			//System.out.println("1");
			String s = null;
			s.length();
//			System.out.println("2");
//			System.out.println("3");
		} catch (Exception e) {
			System.out.println("오류발생");
//		} finally {
//			fi.close();
//			System.out.println("OK");
//		}
		System.out.println("4");
	}
}
