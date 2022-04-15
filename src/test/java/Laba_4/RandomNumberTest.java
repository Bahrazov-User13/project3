package Laba_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomNumberTest {

	@Test
	public void test() {
		int rand;
		for (int i=0; i<100; i++) {
			rand = RandomNumber.getRandomNumber();
			if (!(rand >= 10 && rand <= 80)) {
				fail("Число не в нужном диапазоне");
			}
		}
	}

}
