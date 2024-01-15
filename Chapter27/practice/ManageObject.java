package lang.thegodofjava.Chapter27.practice;

import java.io.*;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = "Chapter27" + separator + "practice" + separator + "serial.obj"; // 저장할 파일의 위치와 파일명
//        SerialDTO dto = new SerialDTO("GodOfJavaBook", 1, true, 100);
//        manager.saveObject(fullPath, dto);
        manager.loadObject(fullPath);
    }

    private void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath); // FileOutputStream 객체 생성
            oos = new ObjectOutputStream(fos); // 객체를 저장하기 위해 ObjectOutputStream 객체 생성, fos 객체는 파일에 저장된다
            oos.writeObject(dto); // 매개변수로 넘어온 객체를 저장한다
            System.out.println("Write Success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                    ;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject(); // read로 시작하는 메소드
            SerialDTO dto = (SerialDTO) obj;
            System.out.println(dto);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}