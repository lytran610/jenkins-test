package exercise_2;

import java.util.Scanner;

import exercise_1.test_1;

public class test_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input length of array: ");

		int length = sc.nextInt();

		int[] a = new test_1().inputArray(length);
		System.out.println("Input number to check: ");
		int num = sc.nextInt();
		new test_2().checkExist(a, num);
	}

	public int[] inputArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Input number of index: " + i);
			array[i] = sc.nextInt();
		}
		return array;
	}

	public void checkExist(int[] array, int numberToCheck) {
		boolean exist = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numberToCheck) {
				exist = true;
				break;
			}
		}
		if (exist) {
			System.out.println("Number " + numberToCheck + " exists in the array");
		} else {
			System.out.println("Number " + numberToCheck + " does not exist in the array");
		}
	}

}
