package pl.waw.mizinski.mbi.logic;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static pl.waw.mizinski.mbi.logic.Jump.DIAGONAL;
import static pl.waw.mizinski.mbi.logic.Jump.HORIZONTAL;
import static pl.waw.mizinski.mbi.logic.Jump.NONE;
import static pl.waw.mizinski.mbi.logic.Jump.VERTICAL;

import org.junit.Before;
import org.junit.Test;

import pl.waw.mizinski.mbi.commons.AlignmentClass;

public class ResultTest {
	
	private Result result;
	
	@Before
	public void setUp() throws Exception {
		result = new Result(prepareServiceMock());
	}
	
	private SequenceAlignmentService prepareServiceMock() {
		SequenceAlignmentService service = mock(SequenceAlignmentService.class);
		when(service.getSequenceA()).thenReturn("AGTCATG");
		when(service.getSequenceB()).thenReturn("GTCATAG");
		int[][] result = { { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 1, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 2, 0, 0, 1, 0, 0 }, { 0, 0, 0, 3, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 4, 1, 1, 0 }, { 0, 0, 1, 0, 1, 5, 2, 1 },
				{ 0, 1, 0, 0, 0, 2, 1, 3 } };
		Jump[][] jumps = {
				{ NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE },
				{ NONE, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL,
						DIAGONAL, DIAGONAL },
				{ NONE, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL,
						DIAGONAL, DIAGONAL },
				{ NONE, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL,
						DIAGONAL, DIAGONAL },
				{ NONE, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL,
						DIAGONAL, DIAGONAL },
				{ NONE, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL, HORIZONTAL,
						DIAGONAL, DIAGONAL },
				{ NONE, DIAGONAL, DIAGONAL, DIAGONAL, VERTICAL, DIAGONAL,
						HORIZONTAL, HORIZONTAL },
				{ NONE, DIAGONAL, DIAGONAL, DIAGONAL, DIAGONAL, VERTICAL,
						DIAGONAL, DIAGONAL } };
		when(service.getAlignmentArray()).thenReturn(result);
		when(service.getJumps()).thenReturn(jumps);
		return service;
	}
	
	@Test
	public void shouldGetSequences() throws Exception {
		assertEquals("AGTCATG", result.getSequenceA());
		assertEquals("GTCATAG", result.getSequenceB());
	}
	
	@Test
	public void shouldGetAlignment() throws Exception {
		assertEquals(4, result.getAlignment(4, 3));
		assertEquals(5, result.getAlignment(5, 4));
		assertEquals(0, result.getAlignment(0, 0));
		assertEquals(3, result.getAlignment(6, 6));
	}
	
	
	@Test
	public void shouldGetAlignmentClass() throws Exception {
		assertEquals(AlignmentClass.alig0, result.getAlignmentClass(0, 0));
		assertEquals(AlignmentClass.alig2, result.getAlignmentClass(6, 5));
		assertEquals(AlignmentClass.alig3, result.getAlignmentClass(6, 4));
		assertEquals(AlignmentClass.alig4, result.getAlignmentClass(6, 6));
		assertEquals(AlignmentClass.alig5, result.getAlignmentClass(5, 4));
		assertEquals(AlignmentClass.alig5, result.getAlignmentClass(4, 3));
	}
	
	@Test
	public void shouldGetMessage() throws Exception {
		assertEquals(Result.ZERO_MESSAGE, result.getMessage(0, 0));
		assertEquals(Result.DIAGONAL_MESSAGE, result.getMessage(6, 5));
		assertEquals(Result.VERTICAL_BREAK_BEGIN_MESSAGE, result.getMessage(6, 4));
		assertEquals(Result.DIAGONAL_MESSAGE, result.getMessage(6, 6));
		assertEquals(Result.DIAGONAL_MESSAGE, result.getMessage(5, 4));
	}
	
	@Test
	public void shouldGetBestResult() throws Exception {
		String[] res = result.getNBestResults(1)[0];
		assertEquals("GTCAT", res[0]);
		assertEquals("GTCAT", res[1]);
	}
	
	@Test
	public void shouldGetNBestResult() throws Exception {
		assertEquals(10, result.getNBestResults(10).length);
		assertEquals(49, result.getNBestResults(Integer.MAX_VALUE).length);
	}
	

	@Test
	public void shouldGetResultsBetterThan() throws Exception {
		assertEquals(19, result.getResultsBetterThan(0).length);
		assertEquals(8, result.getResultsBetterThan(1).length);
		assertEquals(4, result.getResultsBetterThan(2).length);
		assertEquals(2, result.getResultsBetterThan(3).length);
		assertEquals(1, result.getResultsBetterThan(4).length);
		assertEquals(0, result.getResultsBetterThan(5).length);
		assertEquals(0, result.getResultsBetterThan(Integer.MAX_VALUE).length);
	}
}



