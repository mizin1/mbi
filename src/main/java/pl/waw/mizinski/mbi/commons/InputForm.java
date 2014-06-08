package pl.waw.mizinski.mbi.commons;

public class InputForm {
	
	private String sequenceA;
	private String sequenceB;
	
	private int breakBegin;
	private int breakContinue;
	
	private int aa;
	private int ag;
	private int ac;
	private int at;
	private int gg;
	private int gc;
	private int gt;
	private int cc;
	private int ct;
	private int tt;

	public String getSequenceA() {
		return sequenceA;
	}

	public void setSequenceA(String sequenceA) {
		this.sequenceA = sequenceA;
	}

	public String getSequenceB() {
		return sequenceB;
	}

	public void setSequenceB(String sequenceB) {
		this.sequenceB = sequenceB;
	}

	public String getCorrectedSequenceA() {
		return correctSequence(sequenceA);
	}
	
	public String getCorrectedSequenceB() {
		return correctSequence(sequenceB);
	}

	public String correctSequence(String sequence) {
		String ret = sequence.toUpperCase();
		if (ret.contains("T") && ret.contains("U")) {
			ret = ret.replaceAll("U", "T");
		}
		return ret;		
	}
	
	public int getBreakBegin() {
		return breakBegin;
	}

	public void setBreakBegin(int breakBegin) {
		this.breakBegin = breakBegin;
	}

	public int getBreakContinue() {
		return breakContinue;
	}

	public void setBreakContinue(int breakContinue) {
		this.breakContinue = breakContinue;
	}

	public int getAA() {
		return aa;
	}

	public void setAA(int aa) {
		this.aa = aa;
	}

	public int getAG() {
		return ag;
	}

	public void setAG(int ag) {
		this.ag = ag;
	}

	public int getAC() {
		return ac;
	}

	public void setAC(int ac) {
		this.ac = ac;
	}

	public int getAT() {
		return at;
	}

	public void setAT(int at) {
		this.at = at;
	}

	public int getGG() {
		return gg;
	}

	public void setGG(int gg) {
		this.gg = gg;
	}

	public int getGC() {
		return gc;
	}

	public void setGC(int gc) {
		this.gc = gc;
	}

	public int getGT() {
		return gt;
	}

	public void setGT(int gt) {
		this.gt = gt;
	}

	public int getCC() {
		return cc;
	}

	public void setCC(int cc) {
		this.cc = cc;
	}

	public int getCT() {
		return ct;
	}

	public void setCT(int ct) {
		this.ct = ct;
	}

	public int getTT() {
		return tt;
	}

	public void setTT(int tt) {
		this.tt = tt;
	}

}

