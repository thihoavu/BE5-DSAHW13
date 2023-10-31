package coding.mentor.hwd13;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniumGap {
	public static void main(String[] args) {

		int array[] = { 7, 1, 3, 4, 1, 7 };
		int n = 6; // size array

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] == array[j]) {
					int temp = j - i;
					if (temp < min) {
						min = temp;
					}
				}
			}

		}

		if (min == Integer.MAX_VALUE)
			min = -1;
		System.out.println(min);
	}
}
