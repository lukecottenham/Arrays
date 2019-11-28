package main;

public class App {
	public static void main(String[] args) {
		int [] numbers1 = {1,2,3,4,5,6,7,8,9,10};
		for (int i : numbers1) {
			System.out.print(i + " ");
		}
		System.out.println();
		int [] numbers2 = new int[10];
		for (int j = 0; j < 10; j++) {
			numbers2[j] = j * j;
			System.out.print(numbers2[j] + " ");
		}
		System.out.println();
		for (int k = 0; k < 10; k++) {
			numbers2[k] = numbers2[k] * 10;
			System.out.print(numbers2[k] + " ");
		}
	}

}
