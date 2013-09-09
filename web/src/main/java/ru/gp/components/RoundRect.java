package ru.gp.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

@Import(stylesheet = "context:css/roundspans.css")
public class RoundRect {

	@Property
	@Parameter(defaultPrefix = BindingConstants.LITERAL)
	private String name;

	@Property
	@Parameter(defaultPrefix = BindingConstants.LITERAL)
	private String color;

	@Property
	private int indx;

}
