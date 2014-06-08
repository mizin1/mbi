package pl.waw.mizinski.mbi.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.waw.mizinski.mbi.commons.InputForm;

public class InputFormTest {
	
	@Test
	public void shouldUseUpperCase() throws Exception {
		InputForm inputForm = new InputForm();
		inputForm.setSequenceA("aaagggcccttt");
		inputForm.setSequenceB("aaagggcccuuu");
		assertEquals("aaagggcccttt", inputForm.getSequenceA());
		assertEquals("AAAGGGCCCTTT", inputForm.getCorrectedSequenceA());
		assertEquals("aaagggcccuuu", inputForm.getSequenceB());
		assertEquals("AAAGGGCCCUUU", inputForm.getCorrectedSequenceB());
	}
	

	@Test
	public void shouldReplaceUWithT() throws Exception {
		InputForm inputForm = new InputForm();
		inputForm.setSequenceA("tutuTUTU");
		assertEquals("tutuTUTU", inputForm.getSequenceA());
		assertEquals("TTTTTTTT", inputForm.getCorrectedSequenceA());
	}
}
