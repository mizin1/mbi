package pl.waw.mizinski.mbi.logic;

import pl.waw.mizinski.mbi.commons.InputForm;

public abstract class LogicTestBase {
	
	protected InputForm prepareInputForm(String sequenceA, String sequenceB) {
		InputForm inputForm = new InputForm();
		inputForm.setSequenceA(sequenceA);
		inputForm.setSequenceB(sequenceB);
		inputForm.setBreakBegin(3);
		inputForm.setBreakContinue(1);
		inputForm.setAA(1);
		inputForm.setAG(-4);
		inputForm.setAC(-4);
		inputForm.setAT(-4);
		inputForm.setGG(1);
		inputForm.setGC(-4);
		inputForm.setGT(-4);
		inputForm.setCC(1);
		inputForm.setCT(-4);
		inputForm.setTT(1);
		return inputForm;
	}
}
