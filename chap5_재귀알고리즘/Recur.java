package chap5_재귀알고리즘;

import java.util.ArrayList;
import java.util.Scanner;

class IntStack {
	private int[] stk;
	private int capacity;
	private int ptr;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}

	public IntStack (int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try{
			stk = new int[capacity]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할수 없음
			capacity = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++];
	}
	
	public int pop() throws EmptyIntStackException{
		if (ptr <= 0) // 스택이 비어 있음
			throw new EmptyIntStackException();
			return stk[--ptr];
	}
    // 스택의 용량을 반환
//    public int capacity() {
//        return max;
//    }

    // 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
//    public boolean isFull() {
//        return ptr >= max;
//    }

    // 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
//    public void dump() {
//        if (ptr <= 0)
//            System.out.println("스택이 비어 있습니다.");
//        else {
//            for (int i = 0; i < ptr; i++)
//                System.out.print(stack[i] + " ");
//            System.out.println();
//        }
//    }
}


public class Recur {
	static void recur(int n) {
//		if (n > 0) {
//			System.out.println("recur(" + n +" - 1)");
//			recur(n - 1);
//			System.out.println(n);
//			System.out.println("recur(" + n +" - 2)");
//			recur(n - 2);
//		}
		IntStack s = new IntStack(n);
		while (true) {
			if (n > 0) {
				s.push(n);
				continue;
			}
			if (s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int x = stdIn.nextInt();
		recur(x);
	}
}
