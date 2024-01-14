package lang.thegodofjava.Chapter26.study;

import static java.io.File.separator;

import java.io.*;
import java.util.Scanner;


public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manager = new ManageTextFile();
        int numberCount = 10;
        String fullPath = "Chapter26" + separator + "text" + separator + "numbers.txt"; // 파일이 저장될 경로와 파일 이름, separator는 static improt
        manager.writeFile(fullPath, numberCount);
//        manager.readFile(fullPath);
        manager.readFileWithScanner(fullPath);
    }

    public void writeFile(String fileName, int numberCount) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName, false); // 파일에 쓰기 작업을 위해 FileWriter객체 생성, IOException 발생 가능성때문에 try-catch
            bufferedWriter= new BufferedWriter(fileWriter); // 쓰기 작업할때 버퍼를 사용하기 위해 BufferedWriter객체 생성
            for (int loop = 0; loop < numberCount; loop++) {
                bufferedWriter.write(Integer.toString(loop)); // write메소드로 데이터 입력
                bufferedWriter.newLine(); // 줄바꿈
            }
            System.out.println("Write success !!!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close(); // bufferedWriter 객체 사용이 끝나면 객체 닫기
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close(); // fileWriter 객체 사용이 끝나면 객체 닫기
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    public void readFile(String fileName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName); // 파일 읽기 작업을 위해 FileReader 생성, IOException 발생 가능성때문에 try-catch
            bufferedReader= new BufferedReader(fileReader); // 읽기 작업할때 버퍼를 사용하기 위해 BufferedReader 생성
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
            System.out.println("Read success !!!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close(); // bufferedReader 객체 사용이 끝나면 객체 닫기
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close(); // fileReader 객체 사용이 끝나면 객체 닫기
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    public void readFileWithScanner (String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("Read Success!!");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
