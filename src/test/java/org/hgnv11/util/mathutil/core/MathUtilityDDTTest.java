package org.hgnv11.util.mathutil.core;

import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // chuan bi bo data de rieng --DD-Data drive
    // inport vao ham so sanh
    //fill vaof qua tham so ham - ham lam viec voi nhieu data
    //DDT con goi ten khac: paramaterized testing --> kiem thu theo kieu tham so háo

    // dộ data nằm trong hàm static - tĩnh 1 cho để cac nơn lấy
    // dộ data thường la mang 2 chiều

    public static Object[][] initData() {
        return new Object[][]
                {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}}; //n expected
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGiveRightArgsRunWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }

}