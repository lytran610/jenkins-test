package exercise_1;

import java.util.Scanner;

public class test_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input length of array: ");

		int length = sc.nextInt();

		int[] a = new test_1().inputArray(length);
		for (int i = 0; i < length; i++) {
			new test_1().checkDuplicate(a, a[i], i);
		}
	}

	public int[] inputArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Input number of index: " + i);
			array[i] = sc.nextInt();
		}
		return array;
	}

	public void checkDuplicate(int[] array, int numberToCheck, int startFromIndex) {
		//int[] arrayAfter = new int[array.length];
		int count = 0;
		for (int i = startFromIndex; i < array.length; i++) {
			if (array[i] == numberToCheck) {
				count++;
			}
		}
		if (count >= 2) {
			/*int i = 0;
			arrayAfter[i] = numberToCheck;
			i++;*/
			System.out.println("Number duplicate is: " + numberToCheck);
		}
	}

}
