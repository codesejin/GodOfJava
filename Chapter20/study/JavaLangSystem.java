package lang.thegodofjava.Chapter20.study;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        sample.numberMinMaxElapseCheck();
    }

    private void systemPropertiesCheck() {
        System.out.println("java.version="+System.getProperty("java.version"));
        System.out.println("JAVA_HOME="+System.getenv("JAVA_HOME"));
    }

    public void numberMinMaxElapseCheck() {
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        numberSample.numberMinMaxCheck();
        System.out.println("Milli second=" + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second=" + (System.nanoTime() - startNanoTime));
    }
}
