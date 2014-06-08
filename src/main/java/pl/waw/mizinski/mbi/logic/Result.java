package pl.waw.mizinski.mbi.logic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import pl.waw.mizinski.mbi.commons.AlignmentClass;
import pl.waw.mizinski.mbi.commons.IResult;

public class Result implements IResult{
	
	private String sequenceA;
	private String sequenceB;

	private int[][] results;
	private Jump[][] jumps;
	
	private int maxResult;

	public Result(String sequenceA, String sequenceB, int[][] results, Jump[][] jumps) {
		super();
		this.sequenceA = sequenceA;
		this.sequenceB = sequenceB;
		this.results = results;
		this.jumps = jumps;
		findMaxResult();
	}

	private void findMaxResult() {
		for (int i = 1; i <= sequenceA.length(); ++i) {
			for (int j = 0; j <= sequenceB.length(); ++j) {
				maxResult = results[i][j] > maxResult ? results[i][j] : maxResult;
			}
		}
	}

	public String getSequenceA() {
		return sequenceA;
	}

	public String getSequenceB() {
		return sequenceB;
	}

	public int getAlignment(int i, int j) {
		return results[i+1][j+1];
	}

	private Jump getJump(int i, int j) {
		return jumps[i+1][j+1];
	}
	
	public AlignmentClass getAlignmentClass(int i, int j) {
		float result = getAlignment(i, j);
		float alignInterval = ((float)maxResult)/AlignmentClass.values().length;
		int alligmentInt = (int) Math.ceil(result/alignInterval);
		return AlignmentClass.fromInt(alligmentInt);
	}

	public String getMessage(int i, int j) {
		if (getAlignment(i, j) == 0) { 
			return "Żadne z dopasowań nie jest lepsze niż 0";
		}
		Jump jump = getJump(i, j);
		switch (jump) {
			case DIAGONAL:
				return "Brak przerwy, doliczono jedynie wartość dopasowania";
			case VERTICAL:
				return getJump(i - 1, j).isBreak() ? "Kontynuowanie przerwy w pionowej sekwencji" : "Rozpoczęcie przerwy w pioniowej sekwencji";
			case HORIZONTAL:
				return getJump(i, j - 1).isBreak() ? "Kontynuowanie przerwy w poziomej sekwencji" : "Rozpoczęcie przerwy w poziomej sekwencji";
		}
		
		throw new IllegalStateException();
	}
	
	public String[][] getNBestResults(int n) {
		List<Fit> fits = collectBestFits(n);
		return convertFitsToStringsArray(fits);
	}
	
	public String[][] getResultsBetterThan(int alignment) {
		List<Fit> fits = collectFitsBetterThan(alignment);
		return convertFitsToStringsArray(fits);
	}
	
	private String[][] convertFitsToStringsArray(List<Fit> fits) {
		String [][] ret = new String[fits.size()][];
		int i=0;
		for (Fit fit : fits) {
			ret[i++] = fit.getSequencesFragments();
		}
		return ret;
	}
	
	private List<Fit> collectFitsBetterThan(int alignment) {
		List<Fit> fits = new LinkedList<Fit>();
		for (int i = 0; i < sequenceA.length(); ++i) {
			for (int j = 0; j < sequenceB.length(); ++j) {
				Fit fit = new Fit(i, j);
				if (fit.isBetterThan(alignment)) {
					fits.add(fit);
				}
			}
		}
		Collections.sort(fits);
		return fits;
	}

	private List<Fit> collectBestFits(int n) {
		List<Fit> fits = new LinkedList<Fit>();
		Fit worstTakenFit = new Fit(0, 0);
		for (int i = 0; i < sequenceA.length(); ++i) {
			for (int j = 0; j < sequenceB.length(); ++j) {
				Fit fit = new Fit(i, j);
				if (fits.size() < n) {
					fits.add(fit);
					worstTakenFit = newWorstTakenFit(fits);
					continue;
				}
				if (fit.isBetterThan(worstTakenFit)) {
					fits.add(fit);
					fits.remove(worstTakenFit);
					worstTakenFit = newWorstTakenFit(fits);
				}
			}
		}
		Collections.sort(fits);
		return fits;
	}
	
	
	private Fit newWorstTakenFit(List<Fit> fits) {
		if (fits.isEmpty()) {
			return null;
		}
		Fit worstFit = fits.get(0);
		for (Fit fit : fits) {
			if (fit.isWorseThan(worstFit)) {
				worstFit = fit;
			}
		}
		return worstFit;
	}

	private class Fit implements Comparable<Fit>{
		
		public Fit(int i, int j) {
			this.i = i;
			this.j = j;
		}
		
		private int i;
		private int j;
		
		public int alignment() {
			return getAlignment(i, j);
		}
		
		public boolean isBetterThan(Fit fit) {
			return isBetterThan(fit.alignment());
		}
		
		public boolean isWorseThan(Fit fit) {
			return isWorseThan(fit.alignment());
		}
		
		public boolean isBetterThan(int alignment) {
			return alignment() > alignment;
		}
		
		public boolean isWorseThan(int alignment) {
			return alignment() < alignment;
		}

		public int compareTo(Fit fit) {
			return fit.alignment() - alignment();
		}
		
		public String[] getSequencesFragments() {
			StringBuilder fragmentA = new StringBuilder();
			StringBuilder fragmentB = new StringBuilder();
			int x = this.i;
			int y = this.j;
			do {
				fragmentA.append(sequenceA.charAt(x));
				fragmentB.append(sequenceB.charAt(y));
				Jump jump = getJump(x, y);
				x = jump == Jump.HORIZONTAL ? x : x - 1;
				y = jump == Jump.VERTICAL ? y : y - 1;
			} while (getAlignment(x, y) != 0);
			return new String[] {fragmentA.reverse().toString(), fragmentB.reverse().toString()};
		}
	}
}
