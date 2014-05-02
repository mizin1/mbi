package pl.waw.mizinski.mbi.modules.views.output;

import org.objectledge.context.Context;
import org.objectledge.pipeline.ProcessingException;
import org.objectledge.templating.Template;
import org.objectledge.templating.TemplatingContext;
import org.objectledge.web.mvc.builders.AbstractBuilder;
import org.objectledge.web.mvc.builders.BuildException;

import pl.waw.mizinski.mbi.commons.IResult;
import pl.waw.mizinski.mbi.commons.MockResult;

public class Table extends AbstractBuilder{

	public Table(Context context) {
		super(context);
	}

	@Override
	public String build(Template template, String embeddedBuildResults) throws BuildException, ProcessingException {
		IResult result = new MockResult();
		
		final TemplatingContext templatingContext = TemplatingContext.getTemplatingContext(context);
		templatingContext.put("result", result);
		return super.build(template, embeddedBuildResults);
	}
}
