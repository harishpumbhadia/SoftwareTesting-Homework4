package Homework5;

import static org.junit.Assert.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	public Problem4Class prob4;

	@Before
	public void setUp() throws Exception {
		prob4 = new Problem4Class();
	}

	@Test
	@FileParameters("Homework5/Problem-4.csv")
	public void test(int testCaseNumber,double cart, boolean validCode, boolean validDigitalCoupon,boolean loyaltyCard, double output, String basisPath, String mcdc) {
		assertEquals(output, prob4.calcCart(cart, loyaltyCard, validCode, validDigitalCoupon),2);
	}

}
