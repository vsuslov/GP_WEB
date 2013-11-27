package ru.gp.pages;

import org.apache.tapestry5.Block;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Loop;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.upload.services.UploadedFile;
import ru.gp.components.AbstractComponent;
import ru.rs.objects.Core;
import ru.rs.objects.Point;

import java.io.File;

@Import(stylesheet = "context:css/tools.css")
public class SourceTool extends AbstractComponent {
	@Property
	@Persist
	private UploadedFile uploader;

    private ComponentResources resources;

	@Property
	@Persist
	private String name;

    @Property
    @Persist
    private Core core;

    @Property
    private Point point;

    @Property
    private Zone upldr;

    @Property
    private Loop loop;

//    private Block pnts;

	public Block onSuccess() {
        //TODO:распарсить файл и вывести точки на экран

        File copied = new File("d:\\distr\\" + uploader.getFileName());
        uploader.write(copied);
        core.setFileName(copied.getAbsolutePath());
        core.switchToBerger();
        core.ReadFile();
      return resources.getBlock("pnts");
	}
}
