package pl.waw.mizinski.mbi.commons;

public class MockResult implements IResult {
	
	private String sequenceA = "AGTCCCAAATAGTAG";
	private String sequenceB = "AGCTAGTC";
	
	public String getSequenceA() {
		return sequenceA;
	}
	
	public String getSequenceB() {
		return sequenceB;
	}

	public int getAlignment(int i, int j) {
		return 2*i + j;
	}

	public AlignmentClass getAlignmentClass(int i, int j) {
		int alig = (2*i + j)/6;
		return alig > 5 ? AlignmentClass.alig5 : AlignmentClass.fromInt(alig);
	}
}
