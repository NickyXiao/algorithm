package com.fight.algorithm.binary_search;

public class BS1 {
    public static void main(String[] args) {

    }

    /**
     * 查找arr中，是否存在等于value的值
     * @param arr
     * @param value
     * @return
     */
    public static boolean isExist(int[] arr, int value) {
        if (arr == null) {
            return false;
        }

        int L = 0;
        int R = arr.length - 1;
        while (L < R) {
            int mid = L + (R - L) >> 1;
            if (value == arr[mid]) {
                return true;
            } else if(value < arr[mid]) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return arr[L] == value;
    }

    public static boolean isExist2(int[] arr, int value) {
        if (arr == null) {
            return false;
        }

        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = L + (R - L) >> 1;
            if (value == arr[mid]) {
                return true;
            } else if(value < arr[mid]) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return false;
    }
}
