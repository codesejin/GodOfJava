package lang.thegodofjava.Chapter04.blog;

import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {
        int type = 0;
        double input = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("실수를 입력하세요. :");
        input = scanner.nextDouble();

        while(true) {
            System.out.println();
            System.out.print("어떤 타입으로 변한할 것 인가? ( 1.byte 2. short 3. int 4. long 5. float 6. double) : ");
            type = scanner.nextInt();

            if (type > 6 || type < 1) {
                System.out.print("다시 입력하세요. "); continue;
            }
            else break;
        }

        CastingLose cl = new CastingLose(type, input);

        switch (type) {
            case 1 : if(cl.castingLoseResult()==1) { byte btmp = (byte)input; System.out.println("캐스팅 완료 :"+ btmp);} break;
            case 2 : if(cl.castingLoseResult()==1) { short stmp = (short)input; System.out.println("캐스팅 완료 :"+ stmp); }break;
            case 3 : if(cl.castingLoseResult()==1) { int itmp = (int)input; System.out.println("캐스팅 완료 :"+ itmp); }break;
            case 4 : if(cl.castingLoseResult()==1) { long ltmp = (long)input; System.out.println("캐스팅 완료 :"+ ltmp); }break;
            case 5 : if(cl.castingLoseResult()==1) { float ftmp = (float)input; System.out.println("캐스팅 완료 :"+ ftmp); }break;
            case 6 : if(cl.castingLoseResult()==1) { double dtmp = input; System.out.println("캐스팅 완료 :"+ dtmp); }break;
            default : break;
        }
    }
}
