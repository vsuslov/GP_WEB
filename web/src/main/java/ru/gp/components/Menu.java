package ru.gp.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;


@Import(stylesheet = "context:css/menu.css")
public class Menu extends AbstractComponent {

	@Property
	@Parameter(defaultPrefix = BindingConstants.LITERAL)
	private String name;

	@Property
	private String link;

	public String[] getLinks() {
		return new String[] { "Index", "SourceTool" };
	}

	public String getLinkName() {
		return message.get(link);
	}
}
