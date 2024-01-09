package lang.thegodofjava.Chapter25.study;

public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads sample = new RunEndlessThreads();
        sample.endless();
    }

    private void endless() {
        EndlssThread thread = new EndlssThread();
        thread.start();
    }
}
