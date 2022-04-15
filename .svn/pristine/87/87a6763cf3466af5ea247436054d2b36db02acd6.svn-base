package Laba_4;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CreateArrayTest {
	
	private static int[] array;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		array = CreateArray.initArray();
	}

	@Test
	public void test() {
		if (array.length != 7) {
			fail("Размер массива не корректный");
		}
		for (int i=0; i<7; i++) {
			if (array[i] == 0) {
				fail("Массив не заполнился случайными числами");
			}
		}
	}

}
