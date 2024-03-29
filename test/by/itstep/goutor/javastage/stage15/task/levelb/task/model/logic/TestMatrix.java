package by.itstep.goutor.javastage.stage15.task.levelb.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMatrix {
    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    @After
    public void MatrixClearing() {
        matrix = null;
    }


    @Test
    public void testCountEvenElementUpTheMainDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testCountEvenElementDownTheMainDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testCountEvenElementUpTheSideDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementUpTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testCountEvenElementDownTheSideDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementDownTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }


}
