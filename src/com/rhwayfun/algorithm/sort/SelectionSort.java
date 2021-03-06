package com.rhwayfun.algorithm.sort;

/*
 * 选择排序基本思路：
 * 把第一个元素依次和后面的所有元素进行比较。
 * 第一次结束后，就会有最小值出现在最前面。
 * 依次类推
 * 选择排序的时间复杂度是O(n^2)
 */
public class SelectionSort {
	public static void sort(int[] data) {
		for (int x = 0; x < data.length - 1; x++) {
			for (int y = x + 1; y < data.length; y++) {
				if (data[y] < data[x]) {
					SortTest.swap(data, x, y);
				}
			}
		}
	}
}
