package ru.gp.components;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;

public abstract class AbstractComponent {

	@Property
	@Inject
	protected Messages message;
}
