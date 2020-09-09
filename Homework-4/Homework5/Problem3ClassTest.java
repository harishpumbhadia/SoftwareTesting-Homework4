package Homework5;

import static org.junit.Assert.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework5.Problem3Class.state;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	public Problem3Class prob3;
	@Before
	public void setUp() throws Exception {
		prob3 = new Problem3Class();
	}

	@Test
	@FileParameters("Homework5/Problem-3.csv")
	public void test(int testcasenumber, state currentState, state nextState, int D, int G, int P, int Z, int B, int I, int T, int X ) {
		prob3.setNextState(nextState);
		prob3.setB(B);
		prob3.setI(I);
		prob3.setT(T);
		prob3.setX(X);
		prob3.operateBinoculars(currentState, D, G, P, Z);
		assertEquals( B, prob3.getB());
		assertEquals(I, prob3.getI());
		assertEquals( T, prob3.getT());
		assertEquals(X, prob3.getX());
	}

}
