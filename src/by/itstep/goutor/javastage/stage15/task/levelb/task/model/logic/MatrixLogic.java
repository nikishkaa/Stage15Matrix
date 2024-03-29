package by.itstep.goutor.javastage.stage15.task.levelb.task.model.logic;

public class MatrixLogic {
    public static int getCountEvenElementUpTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countEvenUpMain = 0;

        //O(N^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    countEvenUpMain++;
                }

            }
        }


        return countEvenUpMain;
    }

    public static int getCountEvenElementDownTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countEvenDownMain = 0;

        //O(N^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if ((matrix[i][j] % 2) == 0) {
                    countEvenDownMain++;
                }
            }
        }


        return countEvenDownMain;
    }


    public static int getCountEvenElementUpTheSideDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countEvenUpSideElement = 0;

        //O(N^2)
        for (int i = 0, line = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[line++][j] % 2 == 0) {
                    countEvenUpSideElement++;
                }
            }
        }


        return countEvenUpSideElement;
    }


    public static int getCountEvenElementDownTheSideDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countEvenDownSideElement = 0;

        //O(N^2)
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % 2 == 0) {
                    countEvenDownSideElement++;
                }
            }
        }


        return countEvenDownSideElement;
    }
}
