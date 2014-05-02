package pl.waw.mizinski.mbi.commons;

public interface IResult {
	
	String getSequenceA();
	
	String getSequenceB();
	
	int getAlignment(int i, int j);
	
	AlignmentClass getAlignmentClass(int i, int j);
}
