package com.fight.algorithm.class5;

import org.junit.Test;

/**
 * 归并排序迭代方式
 */
public class MergeSortIterativeImpl {
    @Test
    public void test1() {
        sort(new int[16]);
    }

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int arrLength = arr.length;
        for(int i = 1; i < arrLength; i *= 2) {
            // i是步长
            System.out.println(i);

            for(int j =0; j ) {

            }
        }
    }
}
