package main.java.memoranda.ui.htmleditor.filechooser;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ImageFilter extends FileFilter {

    // Accept all directories and all gif, jpg, or tiff files.
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = Utils.getExtension(f);
        boolean result = false;
	if (extension != null) {
		boolean png = extension.equals(Utils.png);
		boolean gif = extension.equals(Utils.gif);
		boolean jpeg = extension.equals(Utils.jpeg);
		boolean jpg = extension.equals(Utils.jpg);
		
		result = png || gif || jpeg || jpg;
        return result;
    }
	return false;
    }

    // The description of this filter
    public String getDescription() {
        return "Images (GIF, JPEG, PNG)";
    }
}
