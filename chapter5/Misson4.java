package chapter5;

public class Misson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idx=0;
		int[] arr = new int [40];
		int year = 2023;
		while(true) {
		for(int i = 2023; ; i++) {
			if((i%4)!=0) {
				System.out.println(i%4);
			} else if((i%4)==0){
				System.out.println("나머지값 ="+i%4);
				arr[idx++] = year;
				year++;
			} else {
				System.out.println("error");
			}
			}
		}
	}
}
