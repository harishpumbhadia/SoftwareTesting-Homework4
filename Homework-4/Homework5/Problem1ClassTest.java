package Homework5;

import static org.junit.Assert.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
	public Problem1Class prob1;
	
	@Before
	public void setUp() throws Exception {
		prob1 = new Problem1Class();
	}
	

	@Test
	@FileParameters("Homework5/Problem-1.csv")
	public void test(int testcasenumber,boolean cruiseEngaged, double speed, double distance, boolean emerBrake, int pulsecount, String comment) {
		prob1.setAutoDisengage(cruiseEngaged);
		prob1.setPulseCount(pulsecount);
		prob1.emerBrakeFunction(cruiseEngaged, speed, distance);
		assertEquals(emerBrake, prob1.isEmerBrake());
		assertEquals(pulsecount, prob1.getPulseCount());
		
	}

}
