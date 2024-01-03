package lang.thegodofjava.Chapter16.c.inner.practice;

public class MyPage {
    static InputBox inputBox;

    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    public void setUI() {
        inputBox = new InputBox();
//        KeyEventListener listener = new KeyEventListener() {
//            @Override
//            public void onKeyDown() {
//                System.out.println("Key Down");
//            }
//
//            @Override
//            public void onKeyUp() {
//                System.out.println("Key Up");
//            }
//        };
//        inputBox.setKeyListener(listener);
        inputBox.setKeyListener(new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        });
    }

    public void pressKey() {
        inputBox.listenerCalled(InputBox.KEY_UP);
        inputBox.listenerCalled(InputBox.KEY_DOWN);
    }

}
