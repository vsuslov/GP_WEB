package ru.gp.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.Block;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;

@Import(stylesheet = "context:css/general.css")
public class ComplexLayout extends AbstractComponent {

	@Property
	@Parameter(defaultPrefix = BindingConstants.LITERAL)
	private String title;
	@Property
	@Parameter(defaultPrefix = BindingConstants.LITERAL)
	private Block menuLinks;

	@Property
	@Parameter(defaultPrefix = BindingConstants.LITERAL)
	private Block content;
	@Property
	@Inject
	@Symbol(SymbolConstants.APPLICATION_VERSION)
	private String version;
}
