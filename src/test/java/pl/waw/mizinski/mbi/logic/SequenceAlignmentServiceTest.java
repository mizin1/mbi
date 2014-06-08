package pl.waw.mizinski.mbi.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.waw.mizinski.mbi.commons.InputForm;

public class SequenceAlignmentServiceTest extends LogicTestBase {
	
	@Test
	public void shouldPerformAlgorithm() throws Exception{
		InputForm inputForm = prepareInputForm("AGTC", "TCGTC");
		SequenceAlignmentService service = new SequenceAlignmentService(inputForm);
		service.performAlgorithm();
		assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, service.getAlignmentArray()[0]);
		assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, service.getAlignmentArray()[1]);
		assertArrayEquals(new int[]{0, 0, 0, 1, 0, 0}, service.getAlignmentArray()[2]);
		assertArrayEquals(new int[]{0, 1, 0, 0, 2, 0}, service.getAlignmentArray()[3]);
		assertArrayEquals(new int[]{0, 0, 2, 0, 0, 3}, service.getAlignmentArray()[4]);
		assertEquals(Jump.NONE, service.getJumps()[0][0]);
		assertEquals(Jump.DIAGONAL, service.getJumps()[2][3]);
		assertEquals(Jump.DIAGONAL, service.getJumps()[3][1]);
		assertEquals(Jump.DIAGONAL, service.getJumps()[3][4]);
		assertEquals(Jump.DIAGONAL, service.getJumps()[4][2]);
		assertEquals(Jump.DIAGONAL, service.getJumps()[4][5]);
	}
	
	
	@Test
	public void shouldPerformAlgorithmWithNonDiagonalBreak() throws Exception{
		InputForm inputForm = prepareInputForm("ATGCATGC", "ATGCATGCATG");
		SequenceAlignmentService service = new SequenceAlignmentService(inputForm);
		service.performAlgorithm();
		assertEquals(Jump.VERTICAL, service.getJumps()[8][11]);
		assertEquals(Jump.HORIZONTAL, service.getJumps()[8][10]);
	}

	@Test
	public void shouldPerformAlgorithmWithLongSequences() throws Exception {
		InputForm inputForm = prepareInputForm("AAGGTUUTGCGC", "AAAGGATTGCGCAAGAT");
		SequenceAlignmentService service = new SequenceAlignmentService(inputForm);
		service.performAlgorithm();
	}
}
	
