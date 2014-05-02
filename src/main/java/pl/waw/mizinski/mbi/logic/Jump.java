package pl.waw.mizinski.mbi.logic;

public enum Jump {
	
	HORIZONTAL, VERTICAL, DIAGONAL, NONE;
	
	public boolean isBreak() {
		return this == HORIZONTAL || this == VERTICAL;
	}
}
