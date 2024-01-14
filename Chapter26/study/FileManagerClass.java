package lang.thegodofjava.Chapter26.study;

import java.io.File;
import java.io.IOException;

public class FileManagerClass {
    public static void main(String[] args) {
        FileManagerClass sample = new FileManagerClass();
        String pathName = "Chapter26"+ File.separator + "test"; // 상대경로
//        String pathName = "../test"; // 상대 경로
        String fileName = "test.txt";

        sample.checkFile(pathName, fileName);
    }

    private void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = "+ file.createNewFile());
            getFileInfo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일 정보를 확인하는 메소드
    private void getFileInfo(File file) throws IOException {
        System.out.println("Absolute path ="+file.getAbsolutePath());
        System.out.println("Absolute path ="+file.getParent());
        System.out.println("Absolute file ="+file.getAbsoluteFile());
        System.out.println("Canonical path ="+file.getCanonicalPath());
        System.out.println("Canonical file ="+file.getCanonicalFile());

        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());
    }
}
