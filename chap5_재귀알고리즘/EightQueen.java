package chap5_재귀알고리즘;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

class Stack3{
	private List<Point>data;
	private int capacity;
	private int ptr;
	
	//생성자
	public Stack3(int maxlen) {
		ptr = 0;
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
	
	public int push(Point p) throws OverflowIntStackException {
		if(ptr >= capacity)	//스택이 가득참
			throw new OverflowIntStackException();
		data.add(p);
		ptr++;
		return 1;
	}
	
	public Point pop() throws EmptyIntStackException{
		if(ptr <= 0) // 스택이 비어 있음
			throw new EmptyIntStackException();
		{
			Point p = data.remove(ptr-1);
			ptr--;
			return p;
		}
	}
	
}

public class EightQueen {
//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking
	public class Chap5_Test_QueenEight_revised {

	}

		public static void SolveQueen(int[][] d) {
			int count = 0, mode = 0;
			int ix = 0, iy = 0;
			Stack3 st = new Stack3(10);
			Point p = new Point(ix, iy);
			d[ix][iy] = 1;
			count++;
			st.push(p);
			while (count < 8) {
				ix++;
				int cy = 0;
				while (ix < d.length) { //행의 크기 (8)
					// 다음 row에 대하여 이동할 col을 조사
					cy = NextMove(d, iy, cy);
					while (cy < d[0].length) { // d[0] 0번쨰 행의 열의 크기(8)
						Point px = new Point(ix,cy);
						st.push(px);
						count++;
						d[ix][cy] = 1;
						break;
					}
					if (cy != d[0].length) {
						break;
					} else {
						p = st.pop();
						count--;
						d[ix][cy] = 0;
					}
				}
			}
		}

		public static boolean checkRow(int[][] d, int crow) {
			// 배열 d에서 crow에 Queen을 놓을수 있나?
			for(int j = 0; j<d.length; j++) {
				if (d[crow][j] == 1) 
					return false;
			}
			return true;
		}

		public static boolean checkCol(int[][] d, int ccol) {
			//배열 d에 ccol 열에 배치할수 있느냐? 있다면 true로 리턴
			for(int i = 0; i<d.length; i++) {
				if(d[i][ccol] == 1)
					return false;
			}
			return true;
		}

		public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
			//배열 d에 d[cx][cy]의 sw 대각선에 배치가 가능하냐?
			int cx = x, cy = y;
			while(cx>=0 && cx<d.length && cy>=0 && cy<d.length) {
				cx++;
				cy--;
				if(d[cx][cy] == 1)
					return false;
			}
			cx = x; cy = y;
			while(cx>=0 && cx<d.length && cy>=0 && cy<d.length) {
				cx--;
				cy++;
				if(d[cx][cy] == 1)
					return false;
			}
			return true;
		}

		public static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
			int cx = x, cy = y;
			while(cx>=0 && cx<d.length && cy>=0 && cy<d.length) {
				cx--;
				cy--;
				if(d[cx][cy] == 1)
					return false;
			}
			cx = x; cy = y;
			while(cx>=0 && cx<d.length && cy>=0 && cy<d.length) {
				cx++;
				cy++;
				if(d[cx][cy] == 1)
					return false;
			}
			return true;
		}

		public static boolean CheckMove(int[][] d, int x, int y) { // (x,y)로 이동 가능한지를 check
			//행, 열, 대각선 방향조사
			if(checkRow(d, x) == true && checkCol(d, y) == true && checkDiagSE(d, x, y) == true && checkDiagSW(d, x, y) == true)
				return true;
			else 
				return false;
		}

		public static int NextMove(int[][] d, int row, int newCol) {// 다음 row에 대하여 이동할 col을 조사
			//행에 있는 열을조사
			for(int col = 0; col<d.length; col++) {
				if(CheckMove(d, row, col) == true ) {
					return col;
				}
			}
			return 0;
		}

		public static void main(String[] args) {
			int row = 8, col = 8;
			int[][] data = new int[8][8];
			for (int i = 0; i < data.length; i++)
				for (int j = 0; j < data[0].length; j++)
					data[i][j] = 0;

			SolveQueen(data);

			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(" " + data[i][j]);
				}
				System.out.println();
			}
		}

}
