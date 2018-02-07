package test.br.edu.impacta.ads;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class ReadmeTest {

	private Calendar cal;
	
	@Before
	public void setData() {
		cal = Calendar.getInstance();
	}
	
	@Test
	public void test() {
		assertEquals(2018,cal.get(Calendar.YEAR));
	}

}
