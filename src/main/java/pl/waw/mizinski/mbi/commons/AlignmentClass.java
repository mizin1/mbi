package pl.waw.mizinski.mbi.commons;

public enum AlignmentClass {
	
	alig0(0), alig1(1), alig2(2), alig3(3), alig4(4), alig5(5);
	
	private int alig;
	
	private AlignmentClass(int alig) {
		this.alig = alig;
	}
	
	public static AlignmentClass fromInt(int alig) {
		for (AlignmentClass alignmentClass : values()) {
			if(alignmentClass.alig == alig) {
				return alignmentClass;
			}
		}
		return null;
	}
}
