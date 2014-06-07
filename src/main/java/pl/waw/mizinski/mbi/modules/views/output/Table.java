package pl.waw.mizinski.mbi.modules.views.output;

import org.objectledge.context.Context;
import org.objectledge.intake.IntakeContext;
import org.objectledge.intake.IntakeException;
import org.objectledge.intake.IntakeTool;
import org.objectledge.intake.model.Group;
import org.objectledge.pipeline.ProcessingException;
import org.objectledge.templating.Template;
import org.objectledge.templating.TemplatingContext;
import org.objectledge.web.mvc.MVCContext;
import org.objectledge.web.mvc.builders.AbstractBuilder;
import org.objectledge.web.mvc.builders.BuildException;

import pl.waw.mizinski.mbi.commons.InputForm;
import pl.waw.mizinski.mbi.logic.Result;
import pl.waw.mizinski.mbi.logic.SequenceAlignmentService;

public class Table extends AbstractBuilder{

	public Table(Context context) {
		super(context);
	}

	@Override
	public String build(Template template, String embeddedBuildResults) throws BuildException, ProcessingException {		
		return super.build(template, embeddedBuildResults);
	}
}
