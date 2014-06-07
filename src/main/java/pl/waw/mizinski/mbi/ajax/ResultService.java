package pl.waw.mizinski.mbi.ajax;

import org.objectledge.context.Context;
import org.objectledge.web.HttpContext;

import pl.waw.mizinski.mbi.commons.IResult;

public class ResultService {
	
	private final Context context;

	public ResultService(Context context) {
		this.context = context;
	}
	
	private IResult getResult() {
		HttpContext httpContext = HttpContext.getHttpContext(context);
		return (IResult) httpContext.getSessionAttribute("result");
	}
	
	public String[] getBestFit() {
		return getNBestFits(1)[0];
	}
	
	public String[][] getNBestFits(int n) {
		IResult result = getResult();
		return result.getNBestResults(n);
	}
	
	public String[][] getFitsBetterThan(int n) {
		IResult result = getResult();
		return result.getResultsBetterThan(n);
	}
}	
