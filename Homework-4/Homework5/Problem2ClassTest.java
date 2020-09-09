package Homework5;

import static org.junit.Assert.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {
	public Problem2Class prob2;
	
	@Before
	public void setUp() throws Exception {
		prob2 = new Problem2Class();
	}

	@Test
	@FileParameters("Homework5/Problem-2.csv")
	public void test(int testcase, int boxInCarNum, int rrCarNum, int shipmentNum, int boxSum,String basispath,String comments ) {
		assertEquals( boxSum, prob2.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum));
	}

}
