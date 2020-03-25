import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CamelCaseConverterTest {

	
	private CamelCaseConverter camelCase ;
	
	@Before
	public void setup() {
		camelCase = new CamelCaseConverter();
	
	}
	
	@Test
	public void devoConverterNomeSimples() throws Exception {
		assertEquals("Lionel", camelCase.converter("lionel"));
	}
	
	@Test
	public void deveConverterNomeSimplesMisturadoMaiusculoMinusculo() throws Exception{
		assertEquals("Lionel", camelCase.converter("lIOnel"));
	}
	
}
