package pl.waw.mizinski.mbi.logic;

import org.junit.Test;

import pl.waw.mizinski.mbi.commons.InputForm;

public class SequenceAlignmentServiceTest {
	
	
	@Test
	public void shouldPerformAlgorithm() {
		InputForm inputForm = new InputForm();
		inputForm.setAA(1);
		inputForm.setGG(1);
		inputForm.setCC(1);
		inputForm.setTT(1);
		inputForm.setBreakBegin(1);
		inputForm.setBreakContinue(1);
		inputForm.setSequenceA("AAA");
		inputForm.setSequenceB("AAA");
		SequenceAlignmentService service = new SequenceAlignmentService(inputForm);
		service.performAlgorithm();
	}
	
}
