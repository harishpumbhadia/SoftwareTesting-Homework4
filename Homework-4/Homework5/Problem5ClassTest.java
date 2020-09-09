package Homework5;

import static org.junit.Assert.assertEquals;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {
	public Problem5Class prob5;
	public Problem5ServerData mockobj;
	
	
	@Before
	public void setUp() throws Exception {
		prob5 = new Problem5Class();
		mockobj = EasyMock.strictMock(Problem5ServerData.class);
	}

	@Test
	@FileParameters("Homework5/Problem-5.csv")
	public void test(int testCaseNumber, double cart, boolean loyaltyCard, boolean validCode, boolean validDigitalCoupon, double output, String basisPath) {
		EasyMock.expect(mockobj.getCart()).andReturn(cart);
		EasyMock.replay(mockobj);
		//prob5.calcCart(mockobj, loyaltyCard, validCode, validDigitalCoupon);
		assertEquals(output,prob5.calcCart(mockobj, loyaltyCard, validCode, validDigitalCoupon),2);
	}

}
