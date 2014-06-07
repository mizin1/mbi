package pl.waw.mizinski.mbi.modules.actions;

import org.objectledge.context.Context;
import org.objectledge.intake.IntakeContext;
import org.objectledge.intake.IntakeException;
import org.objectledge.intake.IntakeTool;
import org.objectledge.intake.model.Group;
import org.objectledge.pipeline.ProcessingException;
import org.objectledge.pipeline.Valve;
import org.objectledge.templating.TemplatingContext;
import org.objectledge.web.HttpContext;
import org.objectledge.web.mvc.MVCContext;

import pl.waw.mizinski.mbi.commons.InputForm;
import pl.waw.mizinski.mbi.logic.Result;
import pl.waw.mizinski.mbi.logic.SequenceAlignmentService;

public class PerformAlgorithm implements Valve{

	public void process(Context context) throws ProcessingException {
		IntakeTool intake = IntakeContext.getIntakeContext(context).getIntakeTool();
		if (intake.isAllValid()) {
			InputForm inputForm;
			
			try {
				Group intakerGroup = intake.get(InputForm.class.getSimpleName(), IntakeTool.DEFAULT_KEY);
				inputForm = new InputForm();
				intakerGroup.setProperties(inputForm);
			} catch (IntakeException e) {
				throw new ProcessingException(e);
			}
			SequenceAlignmentService service = new SequenceAlignmentService(inputForm);
			Result result = service.performAlgorithm();
			
			TemplatingContext templatingContext = TemplatingContext.getTemplatingContext(context);
			templatingContext.put("result", result);
			HttpContext httpContext = HttpContext.getHttpContext(context);
			httpContext.setSessionAttribute("result", result);
		} else {
			MVCContext.getMVCContext(context).setView("input.Default");
		}
	}

}
