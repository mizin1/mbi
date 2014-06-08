package pl.waw.mizinski.mbi.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimilarityMatrixTest extends LogicTestBase{
	
	@Test
	public void shouldGetSimilarity() throws Exception {
		SimilarityMatrix similarityMatrix = new SimilarityMatrix(prepareInputForm("AAAA", "AAAA"));
		assertEquals(-4, similarityMatrix.getSimilarity('A', 'C'));
		assertEquals(-4, similarityMatrix.getSimilarity('C', 'A'));
		assertEquals(1, similarityMatrix.getSimilarity('A', 'A'));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionWhenInvalidCharsGiven() throws Exception {
		SimilarityMatrix similarityMatrix = new SimilarityMatrix(prepareInputForm("AAAA", "AAAA"));
		similarityMatrix.getSimilarity('a', 'c');
	}
}
