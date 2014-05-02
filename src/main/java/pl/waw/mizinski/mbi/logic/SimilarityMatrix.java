package pl.waw.mizinski.mbi.logic;

import static pl.waw.mizinski.mbi.logic.Nucleotide.A;
import static pl.waw.mizinski.mbi.logic.Nucleotide.C;
import static pl.waw.mizinski.mbi.logic.Nucleotide.G;
import static pl.waw.mizinski.mbi.logic.Nucleotide.T;
import pl.waw.mizinski.mbi.commons.InputForm;

public class SimilarityMatrix {
	
	private int[][] matrix = new int[4][4];
	
	public SimilarityMatrix(InputForm inputForm) {
		matrix[A.ordinal()][A.ordinal()] = inputForm.getAA();
		matrix[A.ordinal()][G.ordinal()] = inputForm.getAG();
		matrix[A.ordinal()][C.ordinal()] = inputForm.getAC();
		matrix[A.ordinal()][T.ordinal()] = inputForm.getAT();
		matrix[G.ordinal()][A.ordinal()] = inputForm.getAG();	
		matrix[G.ordinal()][G.ordinal()] = inputForm.getGG();
		matrix[G.ordinal()][C.ordinal()] = inputForm.getGC();
		matrix[G.ordinal()][T.ordinal()] = inputForm.getGT();
		matrix[C.ordinal()][A.ordinal()] = inputForm.getAC();	
		matrix[C.ordinal()][G.ordinal()] = inputForm.getGC();
		matrix[C.ordinal()][C.ordinal()] = inputForm.getCC();
		matrix[C.ordinal()][T.ordinal()] = inputForm.getCT();
		matrix[T.ordinal()][A.ordinal()] = inputForm.getAT();	
		matrix[T.ordinal()][G.ordinal()] = inputForm.getGT();
		matrix[T.ordinal()][C.ordinal()] = inputForm.getCT();
		matrix[T.ordinal()][T.ordinal()] = inputForm.getTT();	
	}
	
	public int getSimilarity(char c1, char c2) {
		Nucleotide firstNucleotide = Nucleotide.fromChar(c1);
		Nucleotide secondNucleotide = Nucleotide.fromChar(c2);
		return matrix[firstNucleotide.ordinal()][secondNucleotide.ordinal()];
	}
}
