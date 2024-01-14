package lang.thegodofjava.Chapter26.study;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String fileName) {
        if (fileName.endsWith(".jpg")) return true;
        return false;
    }
}
