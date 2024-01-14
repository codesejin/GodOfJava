package lang.thegodofjava.Chapter26.study;

import java.io.File;
import java.io.IOException;

public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        String pathName = "Chapter26" + File.separator+"text";
        sample.checkList(pathName);
    }

    private void checkList(String pathName) {
        File file;
        try {
            file = new File(pathName);
//            File[] mainFileList = file.listFiles();
            File[] mainFileList = file.listFiles(new JPGFilenameFilter());
            for (File tempFile: mainFileList) {
                System.out.println(tempFile.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
