package by.itstep.goutor.javastage.stage15.task.levela.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixLogicTest {

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
    public void testMaxUoElement() {
        int expected = 6;

        int actual = MatrixLogic.getMaxUoElement(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDownElement() {
        int expected = 8;

        int actual = MatrixLogic.getMaxDownElement(matrix);

        assertEquals(expected, actual);
    }


}
