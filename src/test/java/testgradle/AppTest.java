package testgradle;

import static org.junit.Assert.*;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		App a = new testgradle.App();
		NormalDistribution normalDistribution = new NormalDistribution(15, 7);

		//assertEquals(new Double(0.5), (a.covidChanceEnMoyenne(normalDistribution, 15)));
		assertEquals( "covidChanceEnMoyenne doit retourner '50%' ", 0.5, (a.covidChanceEnMoyenne(normalDistribution, 15)),0);
		
		
	}

}
