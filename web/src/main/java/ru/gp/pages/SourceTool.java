package ru.gp.pages;

import java.io.File;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.upload.services.UploadedFile;

import ru.gp.components.AbstractComponent;

@Import(stylesheet = "context:css/tools.css")
public class SourceTool extends AbstractComponent {
	@Property
	@Persist
	private UploadedFile uploader;

	@Property
	@Persist
	private String name;

	public void onSuccess() {
		File copied = new File("d:\\distr\\" + uploader.getFileName());

		uploader.write(copied);
	}
}
