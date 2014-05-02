package pl.waw.mizinski.mbi.logic;

import static pl.waw.mizinski.mbi.logic.Jump.*;
import pl.waw.mizinski.mbi.commons.InputForm;
import pl.waw.mizinski.mbi.commons.Result;

public class SequenceAlignmentService {

	private String sequenceA;
	private String sequenceB;

	private int breakBegin;
	private int breakContinue;

	private SimilarityMatrix similarityMatrix;

	private int[][] alignmentArray;
	private Jump[][] jumps;

	public SequenceAlignmentService(InputForm inputForm) {
		sequenceA = inputForm.getSequenceA();
		sequenceB = inputForm.getSequenceB();
		breakBegin = inputForm.getBreakBegin();
		breakContinue = inputForm.getBreakContinue();
		similarityMatrix = new SimilarityMatrix(inputForm);
		alignmentArray = new int[sequenceA.length() + 1][sequenceB.length() + 1];
		jumps = new Jump[sequenceA.length() + 1][sequenceB.length() + 1];
	}

	public Result performAlgorithm() {
		initJumpsArray();
		fillArrarys();
		//TODO stworzenie wyniku
		return null;
	}

	private void fillArrarys() {
		for (int i = 1; i <= sequenceA.length(); ++i) {
			for (int j = 0; j <= sequenceB.length(); ++j) {
				fillArrarysCells(i, j);
			}
		}
	}

	private void fillArrarysCells(int i, int j) {
		int vertical = getAlignment(i, j) + getPenalty(i - 1, j);
		int horizontal = getAlignment(i, j) + getPenalty(i, j - 1);
		int diagonal = getAlignment(i, j);
		if (vertical > horizontal) {
			if (vertical > diagonal) {
				alignmentArray[i][j] = vertical;
				jumps[i][j] = VERTICAL;
			} else {
				alignmentArray[i][j] = diagonal;
				jumps[i][j] = DIAGONAL;
			}
		} else if (horizontal > diagonal) {
			alignmentArray[i][j] = horizontal;
			jumps[i][j] = HORIZONTAL;
		} else {
			alignmentArray[i][j] = diagonal;
			jumps[i][j] = DIAGONAL;
		}
	}

	private int getAlignment(int i, int j) {
		char c1 = sequenceA.charAt(i - 1);
		char c2 = sequenceB.charAt(j - 1);
		return similarityMatrix.getSimilarity(c1, c2);
	}

	private int getPenalty(int i, int j) {
		return jumps[i][j].isBreak() ? breakContinue : breakBegin;
	}

	private void initJumpsArray() {
		for (int i = 0; i <= sequenceA.length(); ++i) {
			jumps[i][0] = NONE;
		}
		for (int i = 0; i <= sequenceB.length(); ++i) {
			jumps[0][i] = NONE;
		}
	}
}
