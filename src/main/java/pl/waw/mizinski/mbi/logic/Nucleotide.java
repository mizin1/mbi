package pl.waw.mizinski.mbi.logic;

public enum Nucleotide {
	A, G, C, T;

	public static Nucleotide fromChar(char c) {
		return c == 'U' ? T : valueOf(String.valueOf(c));
	}
}
