package lang.thegodofjava.Chapter26.e.io.practice;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class FileSizeSummary {

    DecimalFormat formatter;

    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "Chapter26";
        long sum = sample.printFileSize(path);
        System.out.println(path+" 's total size = " + sum);
    }

    public FileSizeSummary() {
//        String pattern = "#,##0.0#";
        String pattern = "0.00";
        formatter  = new DecimalFormat(pattern);
    }

    private long printFileSize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for (File file : fileList) {
                if (file.isFile()) {
                    String tempFileName = file.getAbsolutePath();
                    long fileLength = file.length();
                    System.out.println(tempFileName + " = " + convertFileLength(fileLength));
                    sum += fileLength;
                } else {
                    String tempDirName = file.getAbsolutePath();
                    long fileLength = printFileSize(tempDirName); // 재귀 호출로 하위 디렉터리에 있는 파일도 검색
                    System.out.println("["+tempDirName+"]"+" = " + convertFileLength(fileLength));
                    sum += fileLength;
                }
            }
        }
        return sum;
    }

    private final long KB = 1024;
    private final long MB = 1024 * 1024;
    private final long GB = 1024 * 1024 * 1024;
    private final double initDouble = 0.1;

    private String convertFileLength(long fileLength) {
        StringBuilder sb = new StringBuilder();
        if ( fileLength <= KB ) {
            return sb.append(fileLength).append(" b").toString();
        } else if (fileLength <= MB) {
            double temp = (initDouble * fileLength) / KB;
            String num = formatter.format(temp);
            return sb.append(num).append(" kb").toString();
        } else if (fileLength <= GB) {
            double temp = (initDouble * fileLength) / MB;
            String num = formatter.format(temp);
            return sb.append(num).append(" mb").toString();
        } else {
            double temp = (initDouble * fileLength) / GB;
            String num = formatter.format(temp);
            return sb.append(num).append(" gb").toString();
        }
    }
}
