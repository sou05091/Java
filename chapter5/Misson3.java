package chapter5;

public class Misson3 {
	public void matrix() {
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] result = new int[3][3]; // 곱셈 결과 행렬

        // 행렬 곱셈 연산
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // 곱셈 결과 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	public static void main(String[]args) {
		Misson3 m = new Misson3();
		m.matrix();
	}
}
