package chap_스택과큐;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Point {
	private int x;
	private int y;
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		return this.x + "," + this.y;
//	}
	
	@Override
	public boolean equals(Object p) {
		Point px = (Point)p;
		if(this.x== px.x && this.y == px.y)
		return true;
		else 
		return false;
	}
}
class objectStack{
	private List<Point>data;
	private int capacity;
	private int top;
	//생성자
	
	public objectStack (int maxlen) {
		top = 0;
		capacity = maxlen;
		try{
			data = new ArrayList<Point>(); // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할수 없음
			capacity = 0;
		}
	}
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	// 스택에 x를 푸시
	public int push (Point x) throws OverflowIntStackException{
		if(top >= capacity)
			throw new OverflowIntStackException();
		data.add(x);
		top++;
		return 1;
	}
	
	//스택에 데이터를 팝 (꼭대기에 있는 데이터를 꺼냄)
	public Point pop() throws EmptyIntStackException{
		if (top <= 0) // 스택이 비어 있음
			throw new EmptyIntStackException();
		{
			Point p = data.remove(top-1);
			top--;
			return p;
		}
	}
	
	//스택에서 데이터를 꼭대기에 있는 데이터를 들여다봄
	public Point peek() throws EmptyIntStackException{
		if(top <= 0)
			throw new EmptyIntStackException();
		//return data[top-1];
		return data.get(top-1);
	}
	
	// 스택을 비움
	public void clear() {
		top = 0;
	}
	
	// 스택에서 x를 찾아 인덱스 (없으면 -1)를 반환
	public int indexOf(int x) {
		for (int i = top-1; i>=0; i--) // 꼭대기 부터 선형검색
//			if(data[i] == x)
			if(data.get(i).equals(x))
				return i;// 검색성공
		return -1; // 검색실패
	}
	
	// 스택의 용량을 반환
	public int getCapacity() {
		return capacity;
	}
	//스택에 쌓여 있는 데이터 개수를 반환
	public int size() {
		return top;
	}
	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return top <= 0;
	}
	// 스택이 가득 찼는가?
	public boolean isFull() {
		return top >= capacity;
	}
	
	// 스택안의 모든 데이터를 바닥 -> 꼭대기 순서로 출렭
	public void dump() {
		if(top <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i = 0; i<top; i++) {
				System.out.print(data.get(i) + " ");
			System.out.println();
			}
		}
	}
	
	// 생성자
//	public IntStack(int maxlen) {
//		top = 0;
//		capacity = maxlen;
//		try{
//			data = new int[capacity]; // 스택 본체용 배열을 생성
//		} catch (OutOfMemoryError e) { // 생성할수 없음
//			capacity = 0;
//		}
//	}
}

public class 정수스택 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		objectStack s = new objectStack(8); // 최대 8 개를 push할 수 있는 stack
		Random random = new Random();
		int rndx = 0, rndy = 0;
		Point p = null;
		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)push　(2)pop　(3)peek　(4)dump (0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			switch (menu) {
			case 1: // 푸시
				System.out.print("데이터: ");
				rndx = random.nextInt() % 20;
				rndy = random.nextInt() % 20;
				p = new Point(rndx,rndy);
				try {
					s.push(p);
				//} catch(objectStack.OverflowGenericStackException e) {
				} catch(objectStack.OverflowIntStackException e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 팝
				try {
					p = s.pop();
					System.out.println("pop한 데이터는 " + p + "입니다.");
				//} catch(objectStack.EmptyGenericStackException e) {
				} catch(objectStack.EmptyIntStackException e) {
					System.out.println("stack이 비어있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = s.peek();
					System.out.println("peek한 데이터는 " + p + "입니다.");
				} catch (objectStack.EmptyIntStackException e) {
					System.out.println("stack이 비어있습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
				
			}
		}
	}
}
