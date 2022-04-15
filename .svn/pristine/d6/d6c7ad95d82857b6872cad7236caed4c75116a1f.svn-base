package Laba_4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortTest {
	
	private static int[] array = new int[7];
	private static int[] sort_array = new int[7];
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		for (int i=0; i<7; i++) {
			array[i] = RandomNumber.getRandomNumber();
		}
		for (int i=0; i<7; i++) {
			sort_array[i] = array[i];
		}
	}
	
	@Test
	public void test() {
		sort_array = BubbleSort.bubbleSort(sort_array);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		int d = 0;
		for (int i=0; i<7; i++) {
			if (array[i] == sort_array[i]) {
				d++;
			}
		}
		if (d == 7) {
			fail("Массив неправильно отсортировался");
		}
	}
}
