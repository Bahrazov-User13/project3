package Laba_4;

public class CreateArray {
	public static int[] initArray() {
		int[] array = new int[7];
		for (int i=0; i<7; i++) {
			array[i] = RandomNumber.getRandomNumber();
		}
		return array;
	}
}
