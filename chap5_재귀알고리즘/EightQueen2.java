package chap5_재귀알고리즘;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

class Stack5 {
    private List<Point> data;
    private int capacity;
    private int ptr;

    // 생성자
    public Stack5(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            data = new ArrayList<Point>(); // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    public int push(Point p) throws OverflowIntStackException {
        if (ptr >= capacity) // 스택이 가득 참
            throw new OverflowIntStackException();
        data.add(p);
        ptr++;
        return 1;
    }

    public Point pop() throws EmptyIntStackException {
        if (ptr <= 0) // 스택이 비어 있음
            throw new EmptyIntStackException();
        {
            Point p = data.remove(ptr - 1);
            ptr--;
            return p;
        }
    }

}

public class EightQueen2 {
    public static void SolveQueen(int[][] d) {
        int count = 0;
        int ix = 0, iy = 0;

        Stack5 st = new Stack5(10);
        Point p = new Point(ix, iy);

        d[ix][iy] = 1;
        st.push(p);
        count++;

        while (count < 8) {
            ix++;
            int cy = 0;
            while (ix < d.length) {
                // 다음 row에 대하여 이동할 col을 조사
                while (cy < d[0].length) {
                    if (CheckMove(d, ix, cy)) {
                        Point px = new Point(ix, cy);
                        st.push(px);
                        count++;
                        d[ix][cy] = 1;
                        break;
                    }
                    cy++;
                }
                if (cy != d[0].length) {
                    break;
                } else {
                    p = st.pop();
                    d[p.x][p.y] = 0;
                    count--;
                    cy = p.y + 1;
                    ix = p.x;
                }
            }
        }
    }

    public static boolean checkRow(int[][] d, int crow) {
        // 배열 d에서 crow에 Queen을 놓을 수 있는지 확인
        for (int j = 0; j < d.length; j++) {
            if (d[crow][j] == 1)
                return false;
        }
        return true;
    }

    public static boolean checkCol(int[][] d, int ccol) {
        // 배열 d에 ccol 열에 Queen을 놓을 수 있는지 확인
        for (int i = 0; i < d.length; i++) {
            if (d[i][ccol] == 1)
                return false;
        }
        return true;
    }

    public static boolean checkDiagSE(int[][] d, int x, int y) {
        int cx = x, cy = y;

        // 대각선 방향 (x++, y++) 확인
        while (cx < d.length && cy < d.length) {
            if (d[cx][cy] == 1)
                return false;
            cx++;
            cy++;
        }

        cx = x - 1;
        cy = y - 1;

        // 대각선 방향 (x--, y--) 확인
        while (cx >= 0 && cy >= 0) {
            if (d[cx][cy] == 1)
                return false;
            cx--;
            cy--;
        }

        return true;
    }

    public static boolean checkDiagSW(int[][] d, int x, int y) {
        int cx = x, cy = y;

        // 대각선 방향 (x++, y--) 확인
        while (cx < d.length && cy >= 0) {
            if (d[cx][cy] == 1)
                return false;
            cx++;
            cy--;
        }

        cx = x - 1;
        cy = y + 1;

        // 대각선 방향 (x--, y++) 확인
        while (cx >= 0 && cy < d.length) {
            if (d[cx][cy] == 1)
                return false;
            cx--;
            cy++;
        }

        return true;
    }

    public static boolean CheckMove(int[][] d, int x, int y) {
        if (checkRow(d, x) && checkCol(d, y) && checkDiagSE(d, x, y) && checkDiagSW(d, x, y))
            return true;
        else
            return false;
    }

    public static int NextMove(int[][] d, int row, int newCol) {
        // 다음 row에 대하여 이동할 col을 조사
        for (int col = newCol; col < d.length; col++) {
            if (CheckMove(d, row, col)) {
                return col;
            }
        }
        return -1;
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

