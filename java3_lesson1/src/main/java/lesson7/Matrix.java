package lesson7;

public class Matrix {

    public static void main(String[] args) {
        int col = 3;
        int row = 4;

        int s = 1;

        int[][] array = new int[col][row];

        for (int i = 0; i < row; i++) {
            array[0][i] = s;
            s++;
        }
        for (int i = 1; i < col; i++) {
            array[i][row - 1] = s;
            s++;
        }
        for (int i = row - 2; i >= 0; i--) {
            array[col - 1][i] = s;
            s++;
        }
        for (int i = col - 2; i > 0; i--) {
            array[i][0] = s;
            s++;
        }

        int c = 1;
        int d = 1;

        while (s < col * row) {
            while (array[c][d + 1] == 0) {
                array[c][d] = s;
                s++;
                d++;
            }

            while (array[c + 1][d] == 0) {
                array[c][d] = s;
                s++;
                c++;
            }

            while (array[c][d - 1] == 0) {
                array[c][d] = s;
                s++;
                d--;
            }

            while (array[c - 1][d] == 0) {
                array[c][d] = s;
                s++;
                c--;
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = s;
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (array[i][j] < 10) {
                    System.out.print(array[i][j] + ",  ");
                } else {
                    System.out.print(array[i][j] + ", ");
                }
            }
            System.out.println("");
        }
    }
}
