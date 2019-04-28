package main.java.memoranda.ui.htmleditor.filechooser;

import java.io.File;

public class Utils {

    
    // TASK 3-2 SMELL BETWEEN CLASSES
    // The below method is only used in the ImageFilter.java class and 
    // acts as a helper method for that class. There is no need for this to
    // be isolated from ImageFilter.java in its own class. 
    // This whole class should be deleted and moved into ImageFilter.java
    // however, I am leaving it so you can see my change.
    /*
     * Get the extension of a file.
     */
/*    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }*/

}
