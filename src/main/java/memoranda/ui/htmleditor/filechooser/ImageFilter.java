package main.java.memoranda.ui.htmleditor.filechooser;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ImageFilter extends FileFilter {
    
    public final static String jpeg = "jpeg";
    public final static String jpg = "jpg";
    public final static String gif = "gif";
    public final static String png = "png";

    // Accept all directories and all gif, jpg, or tiff files.
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = getExtension(f);
        boolean result = false;
	if (extension != null) {
		boolean isPng = extension.equals(png);
		boolean isGif = extension.equals(gif);
		boolean isJpeg = extension.equals(jpeg);
		boolean isJpg = extension.equals(jpg);
		
		result = isPng || isGif || isJpeg || isJpg;
        return result;
    }
	return false;
    }

    // The description of this filter
    public String getDescription() {
        return "Images (GIF, JPEG, PNG)";
    }
    
    // TASK 3-2 SMELL BETWEEN CLASSES
    // Moved this helper method into ImageFilter. 
    // It is only called here and should be placed here.
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
}
