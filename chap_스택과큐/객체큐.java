package chap_스택과큐;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Queue{
	
	private List<Point> que;
	private int capacity;
	private int front;
	private int rear;
	private int num;
	// 생성자
	public Queue (int maxlen) {
		capacity = maxlen;
		num = front = rear = 0;
		try {
			que = new ArrayList<Point>();
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	// 비었을때
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	// 가득 찰때
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	//큐에 데이터를 인큐
	public int enque(Point x) throws OverflowIntQueueException{
		if(num>= capacity)
			throw new OverflowIntQueueException();
		//que[rear++] = x;
		que.add(x);
		rear++;
		num++;
		if(rear == capacity)
			rear = 0;
		return 1;
	}
	
	public Point deque() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		//int x = que[front++];
		Point p = que.remove(front);
		front++;
		num--;
		if(front == capacity)
			front = 0;
		return p;
	}
	
	public Point peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que.get(front);
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int indexOf(int x) {
		for(int i = 0; i<num; i++) {
			int idx = (i + front) % capacity;
			if(que.get(idx).equals(x))
				return idx;
		}
		return -1;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= capacity;
	}
	
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for(int i = 0; i<num; i++) {
				int index = (i + front) % capacity;
				System.out.print(que.get(index) + " ");
//			int index = (front + i) % que.size(); // 큐 내부의 인덱스 계산
//		    System.out.print(que.get(index) % capacity + " "); // 요소 출력
			}
			System.out.println();
		}
	}
}

public class 객체큐 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Queue s = new Queue(8); // 최대 8 개를 push할 수 있는 stack
		Random random = new Random();
		int rndx = 0, rndy = 0;
		Point p = null;
		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　(4)dump (0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			switch (menu) {
			case 1: // 인큐
				System.out.print("데이터: ");
				rndx = random.nextInt() % 20;
				rndy = random.nextInt() % 20;
				p = new Point(rndx,rndy);
				try {
					s.enque(p);
				//} catch(Queue.OverflowGenericStackException e) {
				} catch(Queue.OverflowIntQueueException e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = s.deque();
					System.out.println("deque한 데이터는 " + p + "입니다.");
				//} catch(Queue.EmptyGenericStackException e) {
				} catch(Queue.EmptyIntQueueException e) {
					System.out.println("stack이 비어있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = s.peek();
					System.out.println("peek한 데이터는 " + p + "입니다.");
				} catch (Queue.EmptyIntQueueException e) {
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
