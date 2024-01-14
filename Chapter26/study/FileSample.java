package lang.thegodofjava.Chapter26.study;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
//        String pathName = "C:\\GodOfJava\\text"; // 윈도우 절대경로
//        String pathName = "/Users/sejinpark/workspace/java/GodOfJava/Chapter26/study"; // 유닉스계열 절대경로
        String pathName = "Chapter26/study"; // 유닉스계열 상대경로
        sample.checkPath(pathName);
    }
///Users/sejinpark/workspace/java/GodOfJava/Chapter26/study
    private void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
    }

    // 디렉터리 생성
    private void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make " + pathName + " result =" + file.mkdir());
    }

    // 파일인지 디렉터리인지 체크
    private void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is directory? = " + file.isDirectory());
        System.out.println(pathName + " is file? = " + file.isFile());
        System.out.println(pathName + " is hidden? = " + file.isHidden());
    }

    // 권한 확인
    private void canFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " can read? = " + file.canRead());
        System.out.println(pathName + " can write? = " + file.canWrite());
        System.out.println(pathName + " can execute? = " + file.canExecute()); // java 6부터 추가됨
    }

    // 파일이나 경로가 언제 생성되었느지 확인
    private void lastModified(String pathName) {
        File file = new File(pathName);
        long lasted = file.lastModified(); // long타입의 시간 리턴
        System.out.println(pathName + " last modified = " + new Date(lasted));
    }

    // 파일 삭제
    private void delete(String pathName) {
        File file = new File(pathName);
        boolean isDeleted = file.delete();
        System.out.println(pathName + " is deleted? = " + isDeleted);
    }
}
