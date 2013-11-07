package game.teste;

import static org.junit.Assert.*;
import game.entidade.Rand;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RandTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRandom() {
		Rand rand = new Rand();
		int var;
		boolean ver=false;
		
		var=rand.Random(5,10);
		System.out.println(var);
		
		if(var>6 || var<11){
			ver=true;
		}
		
		assertTrue(ver);
	}

}
